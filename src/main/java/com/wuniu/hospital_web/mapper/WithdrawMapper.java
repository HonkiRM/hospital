package com.wuniu.hospital_web.mapper;

import com.wuniu.hospital_web.entity.Withdraw;
import java.util.List;

public interface WithdrawMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Withdraw record);

    Withdraw selectByPrimaryKey(Integer id);

    List<Withdraw> selectAll();

    int updateByPrimaryKey(Withdraw record);
}