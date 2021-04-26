package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Taxi2;

import java.util.List;

public interface Taxi2Service {
    List<Taxi2> selectTaxi2();

    List<Taxi2> selectTaxi2Byfk(Integer cityid);
}
