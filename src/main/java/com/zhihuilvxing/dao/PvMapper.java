package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Pv;

import java.util.List;

public interface PvMapper {
    List<Pv> selectPvByfk(Integer cityid);
    List<Pv> selectPv();
    int deleteByPrimaryKey(Integer id);

    int insert(Pv record);

    int insertSelective(Pv record);

    Pv selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pv record);

    int updateByPrimaryKey(Pv record);
}