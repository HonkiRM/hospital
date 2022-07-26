package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Settlement;
import java.util.List;

public interface SettlementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Settlement record);

    Settlement selectByPrimaryKey(Integer id);

    List<Settlement> selectAll();

    int updateByPrimaryKey(Settlement record);
}