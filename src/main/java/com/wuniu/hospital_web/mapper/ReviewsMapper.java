package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Reviews;
import java.util.List;

public interface ReviewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Reviews record);

    Reviews selectByPrimaryKey(Integer id);

    List<Reviews> selectAll();

    int updateByPrimaryKey(Reviews record);
}