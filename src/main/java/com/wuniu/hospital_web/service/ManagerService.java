package com.wuniu.hospital_web.service;

import com.wuniu.hospital_web.entity.Manager;
import com.wuniu.hospital_web.mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {
    @Autowired
    ManagerMapper managerMapper;

    public Manager login(String name){
        return managerMapper.login(name);
    }
}
