package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Bauco2;

import java.util.List;

public interface Bauco2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bauco2 record);

    int insertSelective(Bauco2 record);

    Bauco2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bauco2 record);

    int updateByPrimaryKey(Bauco2 record);

    List<Bauco2> selectBauco2();

    List<Bauco2> selectBauco2Byfk(Integer cityid);
}