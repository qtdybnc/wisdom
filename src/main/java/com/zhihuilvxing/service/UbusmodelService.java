package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Ubusmodel;

import java.util.List;

public interface UbusmodelService {
    List<Ubusmodel> selectUbusmodel();

    List<Ubusmodel> selectUbusmodelByfk(Integer cityid);
}
