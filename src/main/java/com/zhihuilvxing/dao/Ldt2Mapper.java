package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Ldt2;

import java.util.List;

public interface Ldt2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ldt2 record);

    int insertSelective(Ldt2 record);

    Ldt2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ldt2 record);

    int updateByPrimaryKey(Ldt2 record);

    List<Ldt2> selectLdt2();

    List<Ldt2> selectLdt2Byfk(Integer cityid);
}