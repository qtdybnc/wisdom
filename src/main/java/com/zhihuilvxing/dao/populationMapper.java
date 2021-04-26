package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.population;

public interface populationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(population record);

    int insertSelective(population record);

    population selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(population record);

    int updateByPrimaryKey(population record);
}