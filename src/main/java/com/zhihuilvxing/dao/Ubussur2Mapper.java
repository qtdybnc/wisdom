package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Ubussur2;

import java.util.List;

public interface Ubussur2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ubussur2 record);

    int insertSelective(Ubussur2 record);

    Ubussur2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ubussur2 record);

    int updateByPrimaryKey(Ubussur2 record);

    List<Ubussur2> selectUbussur2();

    List<Ubussur2> selectUbussur2Byfk(Integer cityid);
}