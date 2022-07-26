package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Section;
import java.util.List;

public interface SectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Section record);

    Section selectByPrimaryKey(Integer id);

    List<Section> selectAll();

    int updateByPrimaryKey(Section record);
}