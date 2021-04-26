package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Hdt2;

import java.util.List;

public interface Hdt2Mapper {
    List<Hdt2> selectHdt2Byfk(Integer cityid);
    List<Hdt2> selectHdt2();

    int deleteByPrimaryKey(Integer id);

    int insert(Hdt2 record);

    int insertSelective(Hdt2 record);

    Hdt2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hdt2 record);

    int updateByPrimaryKey(Hdt2 record);
}