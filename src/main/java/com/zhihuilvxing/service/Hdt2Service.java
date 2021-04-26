package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Hdt2;

import java.util.List;

public interface Hdt2Service {
    List<Hdt2> selectHdt2Byfk(Integer cityid);
    List<Hdt2> selectHdt2();
}
