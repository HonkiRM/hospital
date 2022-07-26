package com.wuniu.hospital_web.filters;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 设置过滤器,因为是跨越访问,所以在返回信息的请求头加上一下内容浏览器才会接受消息
 */
@Component
public class CrossFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;
        res.addHeader("Access-Control-Allow-Credentials", "true");
        res.addHeader("Access-Control-Allow-Origin", "*");
        res.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
        //请求头 是可以随时添加 更多的
        //如果在请求头中 加入自己定义的请求头 token  那么就必须在这里设置 请求头 token 允许跨域
        res.addHeader("Access-Control-Allow-Headers", "Content-Type,X-CAF-Authorization-Token,sessionToken,X-TOKEN,token");
        /*
            每一个ajax异步请求 ，都会请求两次 第一次请求 都是 options请求 不需要程序员处理
         */
        //  OPTIONS 请求  每一个ajax请求时，都会首先发送一个OPTIONS 请求 这个请求 不需要程序员处理
        if (((HttpServletRequest) request).getMethod().equals("OPTIONS")) {
            response.getWriter().println("ok");
            return;
        }
        chain.doFilter(request, response);
    }
}
