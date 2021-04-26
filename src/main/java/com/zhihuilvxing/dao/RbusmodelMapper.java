package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Rbusmodel;

import java.util.List;

public interface RbusmodelMapper {
    List<Rbusmodel> selectRbusmodelByfk(Integer cityid);
    List<Rbusmodel> selectRbusmodel();

    int deleteByPrimaryKey(Integer id);

    int insert(Rbusmodel record);

    int insertSelective(Rbusmodel record);

    Rbusmodel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rbusmodel record);

    int updateByPrimaryKey(Rbusmodel record);
}