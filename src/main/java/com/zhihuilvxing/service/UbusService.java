package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Ubus;

import java.util.List;

public interface UbusService {
    List<Ubus> selectUbus();

    List<Ubus> selectUbusByfk(Integer cityid);
}
