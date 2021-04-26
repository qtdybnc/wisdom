package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Ldt;

import java.util.List;

public interface LdtMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ldt record);

    int insertSelective(Ldt record);

    Ldt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ldt record);

    int updateByPrimaryKey(Ldt record);

    List<Ldt> selectLdt();

    List<Ldt> selectLdtByfk(Integer cityid);
}