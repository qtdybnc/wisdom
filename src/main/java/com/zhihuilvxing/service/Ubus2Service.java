package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Ubus2;

import java.util.List;

public interface Ubus2Service {
    List<Ubus2> selectUbus2();

    List<Ubus2> selectUbus2Byfk(Integer cityid);
}
