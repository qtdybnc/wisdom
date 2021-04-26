package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Pvsur2;

import java.util.List;

public interface Pvsur2Service {
    List<Pvsur2> selectPvsur2Byfk(Integer cityid);
    List<Pvsur2> selectPvsur2();
}
