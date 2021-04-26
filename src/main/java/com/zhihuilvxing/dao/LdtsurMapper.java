package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Ldtsur;

import java.util.List;

public interface LdtsurMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ldtsur record);

    int insertSelective(Ldtsur record);

    Ldtsur selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ldtsur record);

    int updateByPrimaryKey(Ldtsur record);

    List<Ldtsur> selectLdtsur();

    List<Ldtsur> selectLdtsurByfk(Integer cityid);
}