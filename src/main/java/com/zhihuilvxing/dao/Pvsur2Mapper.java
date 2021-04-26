package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Pvsur2;

import java.util.List;

public interface Pvsur2Mapper {

    List<Pvsur2> selectPvsur2Byfk(Integer cityid);
    List<Pvsur2> selectPvsur2();
    int deleteByPrimaryKey(Integer id);

    int insert(Pvsur2 record);

    int insertSelective(Pvsur2 record);

    Pvsur2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pvsur2 record);

    int updateByPrimaryKey(Pvsur2 record);
}