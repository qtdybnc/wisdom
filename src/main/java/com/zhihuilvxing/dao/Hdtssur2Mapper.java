package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Hdtssur2;

import java.util.List;

public interface Hdtssur2Mapper {
    List<Hdtssur2> selectHdtssur2Byfk(Integer cityid);
    List<Hdtssur2> selectHdtssur2();
    int deleteByPrimaryKey(Integer id);

    int insert(Hdtssur2 record);

    int insertSelective(Hdtssur2 record);

    Hdtssur2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hdtssur2 record);

    int updateByPrimaryKey(Hdtssur2 record);
}