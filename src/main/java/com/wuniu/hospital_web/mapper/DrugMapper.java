package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Drug;
import java.util.List;

public interface DrugMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Drug record);

    Drug selectByPrimaryKey(Integer id);

    List<Drug> selectAll();

    int updateByPrimaryKey(Drug record);
}