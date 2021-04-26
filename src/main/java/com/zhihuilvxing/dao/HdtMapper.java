package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Hdt;

import java.util.List;

public interface HdtMapper {
    List<Hdt> selectHdtByfk(Integer cityid);
    List<Hdt> selectHdt();

    int deleteByPrimaryKey(Integer id);

    int insert(Hdt record);

    int insertSelective(Hdt record);

    Hdt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hdt record);

    int updateByPrimaryKey(Hdt record);
}