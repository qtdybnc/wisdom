package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Pc;

import java.util.List;

public interface PcMapper {
    List<Pc> selectPc();

    int deleteByPrimaryKey(Integer provinceid);

    int insert(Pc record);

    int insertSelective(Pc record);

    Pc selectByPrimaryKey(Integer provinceid);

    int updateByPrimaryKeySelective(Pc record);

    int updateByPrimaryKey(Pc record);
}