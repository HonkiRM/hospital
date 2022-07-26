package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.PrescriptionMedicine;
import java.util.List;

public interface PrescriptionMedicineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PrescriptionMedicine record);

    PrescriptionMedicine selectByPrimaryKey(Integer id);

    List<PrescriptionMedicine> selectAll();

    int updateByPrimaryKey(PrescriptionMedicine record);
}