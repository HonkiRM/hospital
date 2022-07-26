package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Manager;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ManagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Manager record);

    Manager selectByPrimaryKey(Integer id);

    List<Manager> selectAll();

    int updateByPrimaryKey(Manager record);
    @Select("select *  from t_manager where name = #{name}")
    Manager login(String name);
}