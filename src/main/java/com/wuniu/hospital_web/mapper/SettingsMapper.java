package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Settings;
import java.util.List;

public interface SettingsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Settings record);

    Settings selectByPrimaryKey(Integer id);

    List<Settings> selectAll();

    int updateByPrimaryKey(Settings record);
}