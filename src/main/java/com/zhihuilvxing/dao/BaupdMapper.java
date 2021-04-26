package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Baupd;

import java.util.List;

public interface BaupdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Baupd record);

    int insertSelective(Baupd record);

    Baupd selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Baupd record);

    int updateByPrimaryKey(Baupd record);

    List<Baupd> selectBaupd();

    List<Baupd> selectBaupdByfk(Integer cityid);
}