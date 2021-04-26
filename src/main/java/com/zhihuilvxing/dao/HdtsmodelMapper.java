package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Hdtsmodel;

import java.util.List;

public interface HdtsmodelMapper {
    List<Hdtsmodel> selectHdtsmodelByfk(Integer cityid);
    List<Hdtsmodel> selectHdtsmodel();
    int deleteByPrimaryKey(Integer id);

    int insert(Hdtsmodel record);

    int insertSelective(Hdtsmodel record);

    Hdtsmodel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hdtsmodel record);

    int updateByPrimaryKey(Hdtsmodel record);
}