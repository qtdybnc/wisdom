package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Pvsur;
import com.zhihuilvxing.domain.Rbussur;

import java.util.List;

public interface PvsurMapper {
    List<Pvsur> selectPvsurByfk(Integer cityid);
    List<Pvsur> selectPvsur();

    int deleteByPrimaryKey(Integer id);

    int insert(Pvsur record);

    int insertSelective(Pvsur record);

    Pvsur selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pvsur record);

    int updateByPrimaryKey(Pvsur record);
}