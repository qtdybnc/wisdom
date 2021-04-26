package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Bauof;

import java.util.List;

public interface BauofService {
    List<Bauof> selectBauof();

    List<Bauof> selectBauofByfk(Integer cityid);
}
