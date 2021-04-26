package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Bauev;

import java.util.List;

public interface BauevMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bauev record);

    int insertSelective(Bauev record);

    Bauev selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bauev record);

    int updateByPrimaryKey(Bauev record);

    List<Bauev> selectBauev();

    List<Bauev> selectBauevByfk(Integer cityid);
}