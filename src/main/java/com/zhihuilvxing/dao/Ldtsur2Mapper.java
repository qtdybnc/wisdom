package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Ldtsur2;

import java.util.List;

public interface Ldtsur2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ldtsur2 record);

    int insertSelective(Ldtsur2 record);

    Ldtsur2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ldtsur2 record);

    int updateByPrimaryKey(Ldtsur2 record);

    List<Ldtsur2> selectLdtsur2();

    List<Ldtsur2> selectLdtsur2Byfk(Integer cityid);
}