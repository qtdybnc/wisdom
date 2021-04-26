package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Ldtmodel;

import java.util.List;

public interface LdtmodelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ldtmodel record);

    int insertSelective(Ldtmodel record);

    Ldtmodel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ldtmodel record);

    int updateByPrimaryKey(Ldtmodel record);

    List<Ldtmodel> selectLdtmodel();

    List<Ldtmodel> selectLdtmodelByfk(Integer cityid);
}