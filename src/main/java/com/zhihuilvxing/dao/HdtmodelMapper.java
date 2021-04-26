package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Hdtmodel;

import java.util.List;

public interface HdtmodelMapper {
    List<Hdtmodel> selectHdtmodelByfk(Integer cityid);
    List<Hdtmodel> selectHdtmodel();

    int deleteByPrimaryKey(Integer id);

    int insert(Hdtmodel record);

    int insertSelective(Hdtmodel record);

    Hdtmodel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hdtmodel record);

    int updateByPrimaryKey(Hdtmodel record);
}