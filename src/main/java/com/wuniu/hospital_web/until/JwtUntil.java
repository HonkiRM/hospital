package com.wuniu.hospital_web.until;


import com.wuniu.hospital_web.entity.JwtInfo;
import io.jsonwebtoken.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class JwtUntil {
    private static Properties properties = new Properties();

    //加载配置里的信息
    static {
        InputStream is = JwtUntil.class.getClassLoader().getResourceAsStream("jwt.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 生成token
     * @param jwtInfo   自定义信息的对象
     * @return
     */
    public static String createToken(JwtInfo jwtInfo) {

        try {
//生成JwtBuilder对象
            JwtBuilder jwtBuilder = Jwts.builder();
            //设置头信息
            jwtBuilder.setHeaderParam("typ", properties.getProperty("typ"));
            jwtBuilder.setHeaderParam("alg", properties.getProperty("alg"));
            //设置荷载
            jwtBuilder.setIssuer(properties.getProperty("issuer"));
            long expire_time = 30 * 60 * 1000; //30分钟的毫秒数
            String expiration = properties.getProperty("expiration");
            jwtBuilder.setExpiration(new Date(new Date().getTime() + Long.parseLong(expiration)));
            jwtBuilder.setSubject(properties.getProperty("suject"));
            //设置自定义信息
            jwtBuilder.claim(properties.getProperty("userName"), jwtInfo.getUsername());
            //设置签证
            jwtBuilder.signWith(SignatureAlgorithm.HS256, properties.getProperty("secret"));
            //生成token
            String token = jwtBuilder.compact();
            return token;
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new RuntimeException("生成Token出错!");
        }
    }

    /**
     * 解析JWT的token
     * @param token
     * @return
     */
    public static Claims parseToken(String token){
        try {
            JwtParser jwtParser = Jwts.parser();
            Jws<Claims> claimsJws = jwtParser.setSigningKey(properties.getProperty("secret")).parseClaimsJws(token);
            Claims body = claimsJws.getBody();
            return body;
        }catch (ExpiredJwtException e){
            e.printStackTrace();
            throw  new ExpiredJwtException(null,null,"token已经过期！",e);
        }catch (SignatureException e1){
            e1.printStackTrace();
            throw new SignatureException("密钥不正确！",e1);
        }catch (RuntimeException e2){
            e2.printStackTrace();
            throw new RuntimeException("解析token出错！",e2);
        }
    }
    /**
     * 解析JWT的token  返回里面的用户名
     * @param token
     * @return
     */
    public static String getUsername(String token){
        try {
            JwtParser jwtParser = Jwts.parser();
            Jws<Claims> claimsJws = jwtParser.setSigningKey(properties.getProperty("secret")).parseClaimsJws(token);
            Claims body = claimsJws.getBody();
            String userName = (String) body.get(properties.getProperty("userName"));
            return userName;
        }catch (ExpiredJwtException e){
            e.printStackTrace();
            throw  new ExpiredJwtException(null,null,"token已经过期！",e);
        }catch (SignatureException e1){
            e1.printStackTrace();
            throw new SignatureException("密钥不正确！",e1);
        }catch (RuntimeException e2){
            e2.printStackTrace();
            throw new RuntimeException("解析token出错！",e2);
        }
    }

}
