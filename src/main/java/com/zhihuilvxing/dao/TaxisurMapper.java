package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Taxisur;

import java.util.List;

public interface TaxisurMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Taxisur record);

    int insertSelective(Taxisur record);

    Taxisur selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Taxisur record);

    int updateByPrimaryKey(Taxisur record);

    List<Taxisur> selectTaxisur();

    List<Taxisur> selectTaxisurByfk(Integer cityid);
}