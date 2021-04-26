package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Rbussur2;

import java.util.List;

public interface Rbussur2Service {
    List<Rbussur2> selectRbussur2Byfk(Integer cityid);
    List<Rbussur2> selectRbussur2();
}
