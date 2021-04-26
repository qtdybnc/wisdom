package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Baumil;

import java.util.List;

public interface BaumilMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Baumil record);

    int insertSelective(Baumil record);

    Baumil selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Baumil record);

    int updateByPrimaryKey(Baumil record);

    List<Baumil> selectBaumil();

    List<Baumil> selectBaumilByfk(Integer cityid);

    List<Baumil> selectBaumilByf(Integer modeid);
}