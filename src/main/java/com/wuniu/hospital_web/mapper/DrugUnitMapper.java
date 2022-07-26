package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.DrugUnit;
import java.util.List;

public interface DrugUnitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugUnit record);

    DrugUnit selectByPrimaryKey(Integer id);

    List<DrugUnit> selectAll();

    int updateByPrimaryKey(DrugUnit record);
}