package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Gdppercapita;

import java.util.List;

public interface GdppercapitaMapper {
    List<Gdppercapita> selectByPrimaryKey(Integer provinceid);
    int deleteByPrimaryKey(Integer id);

    int insert(Gdppercapita record);

    int insertSelective(Gdppercapita record);



    int updateByPrimaryKeySelective(Gdppercapita record);

    int updateByPrimaryKey(Gdppercapita record);
}