package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Taxi2;

import java.util.List;

public interface Taxi2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Taxi2 record);

    int insertSelective(Taxi2 record);

    Taxi2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Taxi2 record);

    int updateByPrimaryKey(Taxi2 record);

    List<Taxi2> selectTaxi2();

    List<Taxi2> selectTaxi2Byfk(Integer cityid);
}