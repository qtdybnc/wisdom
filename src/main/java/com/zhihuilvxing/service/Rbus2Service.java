package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Rbus2;

import java.util.List;

public interface Rbus2Service {
    List<Rbus2> selectRbus2Byfk(Integer cityid);
    List<Rbus2> selectRbus2();
}
