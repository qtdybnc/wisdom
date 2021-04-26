package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Bau1;

import java.util.List;

public interface Bau1Service {
    List<Bau1> selectBau1();

    List<Bau1> selectBau1Byfk(Integer cityid);
}
