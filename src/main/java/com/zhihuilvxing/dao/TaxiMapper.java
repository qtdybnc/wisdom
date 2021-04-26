package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Taxi;

import java.util.List;

public interface TaxiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Taxi record);

    int insertSelective(Taxi record);

    Taxi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Taxi record);

    int updateByPrimaryKey(Taxi record);

    List<Taxi> selectTaxi();

    List<Taxi> selectTaxiByfk(Integer cityid);
}