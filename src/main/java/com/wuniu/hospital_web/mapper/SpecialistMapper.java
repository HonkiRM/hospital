package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Specialist;
import java.util.List;

public interface SpecialistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Specialist record);

    Specialist selectByPrimaryKey(Integer id);

    List<Specialist> selectAll();

    int updateByPrimaryKey(Specialist record);
}