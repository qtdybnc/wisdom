package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Ubusmodel;

import java.util.List;

public interface UbusmodelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ubusmodel record);

    int insertSelective(Ubusmodel record);

    Ubusmodel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ubusmodel record);

    int updateByPrimaryKey(Ubusmodel record);

    List<Ubusmodel> selectUbusmodel();

    List<Ubusmodel> selectUbusmodelByfk(Integer cityid);
}