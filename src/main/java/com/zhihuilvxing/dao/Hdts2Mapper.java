package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Hdts2;

import java.util.List;

public interface Hdts2Mapper {
    List<Hdts2> selectHdts2Byfk(Integer cityid);
    List<Hdts2> selectHdts2();
    int deleteByPrimaryKey(Integer id);

    int insert(Hdts2 record);

    int insertSelective(Hdts2 record);

    Hdts2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hdts2 record);

    int updateByPrimaryKey(Hdts2 record);
}