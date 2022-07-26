package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Duty;
import java.util.List;

public interface DutyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Duty record);

    Duty selectByPrimaryKey(Integer id);

    List<Duty> selectAll();

    int updateByPrimaryKey(Duty record);
}