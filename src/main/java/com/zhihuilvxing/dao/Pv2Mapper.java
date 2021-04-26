package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Pv2;

import java.util.List;

public interface Pv2Mapper {
    List<Pv2> selectPv2Byfk(Integer cityid);
    List<Pv2> selectPv2();
    int deleteByPrimaryKey(Integer id);

    int insert(Pv2 record);

    int insertSelective(Pv2 record);

    Pv2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pv2 record);

    int updateByPrimaryKey(Pv2 record);
}