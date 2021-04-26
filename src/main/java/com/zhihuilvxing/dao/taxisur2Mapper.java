package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.taxisur2;

import java.util.List;

public interface taxisur2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(taxisur2 record);

    int insertSelective(taxisur2 record);

    taxisur2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(taxisur2 record);

    int updateByPrimaryKey(taxisur2 record);

    List<taxisur2> selectTaxisur2();

    List<taxisur2> selectTaxisur2Byfk(Integer cityid);
}