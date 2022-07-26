package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Prescription;
import java.util.List;

public interface PrescriptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Prescription record);

    Prescription selectByPrimaryKey(Integer id);

    List<Prescription> selectAll();

    int updateByPrimaryKey(Prescription record);
}