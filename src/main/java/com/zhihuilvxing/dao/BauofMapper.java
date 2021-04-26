package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Bauof;

import java.util.List;

public interface BauofMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bauof record);

    int insertSelective(Bauof record);

    Bauof selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bauof record);

    int updateByPrimaryKey(Bauof record);

    List<Bauof> selectBauof();

    List<Bauof> selectBauofByfk(Integer cityid);
}