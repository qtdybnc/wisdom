package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Hdtsur2;

import java.util.List;

public interface Hdtsur2Service {

    List<Hdtsur2> selectHdtsur2Byfk(Integer cityid);
    List<Hdtsur2> selectHdtsur2();
}
