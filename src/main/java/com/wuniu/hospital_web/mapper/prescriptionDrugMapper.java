package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.prescriptionDrug;
import java.util.List;

public interface prescriptionDrugMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(prescriptionDrug record);

    prescriptionDrug selectByPrimaryKey(Integer id);

    List<prescriptionDrug> selectAll();

    int updateByPrimaryKey(prescriptionDrug record);
}