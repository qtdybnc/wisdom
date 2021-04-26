package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Rbus;

import java.util.List;

public interface RbusService {
    List<Rbus> selectRbusByfk(Integer cityid);
    List<Rbus> selectRbus();

    int addRbus(Rbus rbus);
}
