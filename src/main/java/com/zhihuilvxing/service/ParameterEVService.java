package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.ParameterEV;

import java.util.List;

public interface ParameterEVService {
    List<ParameterEV> selectParameterEV();

    List<ParameterEV> selectParameterEVByf(Integer modeid);
}
