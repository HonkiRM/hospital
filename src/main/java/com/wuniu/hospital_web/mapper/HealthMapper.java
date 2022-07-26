package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Health;
import java.util.List;

public interface HealthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Health record);

    Health selectByPrimaryKey(Integer id);

    List<Health> selectAll();

    int updateByPrimaryKey(Health record);
}