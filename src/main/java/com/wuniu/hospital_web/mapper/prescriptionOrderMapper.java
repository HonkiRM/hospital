package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.prescriptionOrder;
import java.util.List;

public interface prescriptionOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(prescriptionOrder record);

    prescriptionOrder selectByPrimaryKey(Integer id);

    List<prescriptionOrder> selectAll();

    int updateByPrimaryKey(prescriptionOrder record);
}