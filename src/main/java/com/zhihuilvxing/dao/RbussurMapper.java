package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Rbussur;

import java.util.List;

public interface RbussurMapper {
    List<Rbussur> selectRbussurByfk(Integer cityid);
    List<Rbussur> selectRbussur();

    int deleteByPrimaryKey(Integer id);

    int insert(Rbussur record);

    int insertSelective(Rbussur record);

    Rbussur selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rbussur record);

    int updateByPrimaryKey(Rbussur record);
}