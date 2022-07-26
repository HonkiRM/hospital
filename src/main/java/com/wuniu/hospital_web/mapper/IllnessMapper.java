package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Illness;
import java.util.List;

public interface IllnessMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Illness record);

    Illness selectByPrimaryKey(Integer id);

    List<Illness> selectAll();

    int updateByPrimaryKey(Illness record);
}