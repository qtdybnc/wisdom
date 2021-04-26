package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Rbus;

import java.util.List;

public interface RbusMapper {
    List<Rbus> selectRbusByfk(Integer cityid);
    List<Rbus> selectRbus();
    int deleteByPrimaryKey(Integer id);

    int insert(Rbus record);

    int insertSelective(Rbus record);

    Rbus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rbus record);

    int updateByPrimaryKey(Rbus record);

    int addRbus(Rbus rbus);
}