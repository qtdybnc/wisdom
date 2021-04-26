package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Ubus2;

import java.util.List;

public interface Ubus2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ubus2 record);

    int insertSelective(Ubus2 record);

    Ubus2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ubus2 record);

    int updateByPrimaryKey(Ubus2 record);

    List<Ubus2> selectUbus2();

    List<Ubus2> selectUbus2Byfk(Integer cityid);
}