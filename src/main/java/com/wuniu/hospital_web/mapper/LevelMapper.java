package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Level;
import java.util.List;

public interface LevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Level record);

    Level selectByPrimaryKey(Integer id);

    List<Level> selectAll();

    int updateByPrimaryKey(Level record);
}