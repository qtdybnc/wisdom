package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Rbussur2;

import java.util.List;

public interface Rbussur2Mapper {
    List<Rbussur2> selectRbussur2Byfk(Integer cityid);
    List<Rbussur2> selectRbussur2();
    int deleteByPrimaryKey(Integer id);

    int insert(Rbussur2 record);

    int insertSelective(Rbussur2 record);

    Rbussur2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rbussur2 record);

    int updateByPrimaryKey(Rbussur2 record);
}