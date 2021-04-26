package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Hdts;

import java.util.List;

public interface HdtsMapper {
    List<Hdts> selectHdtsByfk(Integer cityid);
    List<Hdts> selectHdts();
    int deleteByPrimaryKey(Integer id);

    int insert(Hdts record);

    int insertSelective(Hdts record);

    Hdts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hdts record);

    int updateByPrimaryKey(Hdts record);
}