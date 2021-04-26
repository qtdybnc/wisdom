package com.zhihuilvxing.dao;

import com.zhihuilvxing.domain.ParameterEV;

import java.util.List;

public interface ParameterEVMapper {
    List<ParameterEV> selectParameterEV();

    List<ParameterEV> selectParameterEVByf(Integer modeid);
}
