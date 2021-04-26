package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Ubussur2;

import java.util.List;

public interface Ubussur2Service {
    List<Ubussur2> selectUbussur2();

    List<Ubussur2> selectUbussur2Byfk(Integer cityid);
}
