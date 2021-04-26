package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Rbus2;

import java.util.List;

public interface Rbus2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rbus2 record);

    int insertSelective(Rbus2 record);

    Rbus2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rbus2 record);

    int updateByPrimaryKey(Rbus2 record);

    List<Rbus2> selectRbus2Byfk(Integer cityid);
    List<Rbus2> selectRbus2();
}