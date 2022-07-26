package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Advertise;
import java.util.List;

public interface AdvertiseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Advertise record);

    Advertise selectByPrimaryKey(Integer id);

    List<Advertise> selectAll();

    int updateByPrimaryKey(Advertise record);
}