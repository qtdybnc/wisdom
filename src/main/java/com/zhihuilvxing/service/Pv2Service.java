package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Pv;
import com.zhihuilvxing.domain.Pv2;

import java.util.List;

public interface Pv2Service {
    List<Pv2> selectPv2Byfk(Integer cityid);
    List<Pv2> selectPv2();

}
