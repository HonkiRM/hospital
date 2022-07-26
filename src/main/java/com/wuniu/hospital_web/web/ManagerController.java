package com.wuniu.hospital_web.web;

import com.wuniu.hospital_web.entity.Manager;
import com.wuniu.hospital_web.result.ResultResponse;
import com.wuniu.hospital_web.service.ManagerService;
import com.wuniu.hospital_web.vo.ManagerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("manager")
public class ManagerController {
    @Autowired
    ManagerService managerService;

    @PostMapping("/login")
    public ResultResponse<Manager> login(@RequestBody ManagerVo managerVo) {
        ResultResponse<Manager> result = null;
        try {
            Manager manager = managerService.login(managerVo.getName());
            if (manager == null) {
                result = new ResultResponse<>(201, "账号不存在!");
            } else if (manager.getPassword().equals(managerVo.getPassword())) {
                //登录成功
                result = new ResultResponse<>(200, "登录成功", manager);
                //生成token存入到返回前端的对象中,以后每次前端访问后端携带token,拦截器拦截后判断token是否存在或者 状态
//                String token = JwtUntil.createToken(new JwtInfo(manager.getUserName()));
//                result.setToken(token);
            } else {
                result = new ResultResponse<>(202, "密码错误!");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            result = new ResultResponse<>(203, "系统错误，请联系管理员!");
        }
        return result;
    }
}
