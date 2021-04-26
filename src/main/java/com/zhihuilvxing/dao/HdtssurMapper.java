package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Hdtssur;

import java.util.List;

public interface HdtssurMapper {
    List<Hdtssur> selectHdtssurByfk(Integer cityid);
    List<Hdtssur> selectHdtssur();
    int deleteByPrimaryKey(Integer id);

    int insert(Hdtssur record);

    int insertSelective(Hdtssur record);

    Hdtssur selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hdtssur record);

    int updateByPrimaryKey(Hdtssur record);
}