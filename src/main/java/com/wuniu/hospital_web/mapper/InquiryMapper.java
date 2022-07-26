package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Inquiry;
import java.util.List;

public interface InquiryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Inquiry record);

    Inquiry selectByPrimaryKey(Integer id);

    List<Inquiry> selectAll();

    int updateByPrimaryKey(Inquiry record);
}