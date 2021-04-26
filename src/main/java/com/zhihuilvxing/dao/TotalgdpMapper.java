package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.Totalgdp;

public interface TotalgdpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Totalgdp record);

    int insertSelective(Totalgdp record);

    Totalgdp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Totalgdp record);

    int updateByPrimaryKey(Totalgdp record);
}