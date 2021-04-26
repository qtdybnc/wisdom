package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Ubus;

import java.util.List;

public interface UbusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ubus record);

    int insertSelective(Ubus record);

    Ubus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ubus record);

    int updateByPrimaryKey(Ubus record);

    List<Ubus> selectUbus();

    List<Ubus> selectUbusByfk(Integer cityid);
}