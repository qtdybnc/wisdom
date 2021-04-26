package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Ubussur;

import java.util.List;

public interface UbussurMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ubussur record);

    int insertSelective(Ubussur record);

    Ubussur selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ubussur record);

    int updateByPrimaryKey(Ubussur record);

    List<Ubussur> selectUbussur();

    List<Ubussur> selectUbussurByfk(Integer cityid);
}