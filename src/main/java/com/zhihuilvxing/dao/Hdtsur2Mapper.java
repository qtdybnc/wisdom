package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Hdtsur2;

import java.util.List;

public interface Hdtsur2Mapper {
    List<Hdtsur2> selectHdtsur2Byfk(Integer cityid);
    List<Hdtsur2> selectHdtsur2();
    int deleteByPrimaryKey(Integer id);

    int insert(Hdtsur2 record);

    int insertSelective(Hdtsur2 record);

    Hdtsur2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hdtsur2 record);

    int updateByPrimaryKey(Hdtsur2 record);
}