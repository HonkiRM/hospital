package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Hospital;
import java.util.List;

public interface HospitalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hospital record);

    Hospital selectByPrimaryKey(Integer id);

    List<Hospital> selectAll();

    int updateByPrimaryKey(Hospital record);
}