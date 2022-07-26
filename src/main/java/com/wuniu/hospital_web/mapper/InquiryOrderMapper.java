package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.InquiryOrder;
import java.util.List;

public interface InquiryOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InquiryOrder record);

    InquiryOrder selectByPrimaryKey(Integer id);

    List<InquiryOrder> selectAll();

    int updateByPrimaryKey(InquiryOrder record);
}