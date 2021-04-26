package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Hdts2;

import java.util.List;

public interface Hdts2Service {
    List<Hdts2> selectHdts2Byfk(Integer cityid);
    List<Hdts2> selectHdts2();
}
