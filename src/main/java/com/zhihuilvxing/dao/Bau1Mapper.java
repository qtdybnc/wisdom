package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Bau1;

import java.util.List;

public interface Bau1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bau1 record);

    int insertSelective(Bau1 record);

    Bau1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bau1 record);

    int updateByPrimaryKey(Bau1 record);

    List<Bau1> selectBau1();

    List<Bau1> selectBau1Byfk(Integer cityid);
}