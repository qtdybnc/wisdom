package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Pv;
import com.zhihuilvxing.domain.Pvmodel;

import java.util.List;

public interface PvmodelMapper {

    List<Pvmodel> selectPvmodelByfk(Integer cityid);
    List<Pvmodel> selectPvmodel();

    int deleteByPrimaryKey(Integer id);

    int insert(Pvmodel record);

    int insertSelective(Pvmodel record);

    Pvmodel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pvmodel record);

    int updateByPrimaryKey(Pvmodel record);
}