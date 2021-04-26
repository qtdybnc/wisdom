package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Hdtsur;

import java.util.List;

public interface HdtsurMapper {
    List<Hdtsur> selectHdtsurByfk(Integer cityid);
    List<Hdtsur> selectHdtsur();
    int deleteByPrimaryKey(Integer id);

    int insert(Hdtsur record);

    int insertSelective(Hdtsur record);

    Hdtsur selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hdtsur record);

    int updateByPrimaryKey(Hdtsur record);
}