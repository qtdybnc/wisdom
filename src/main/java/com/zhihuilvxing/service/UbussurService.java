package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Ubussur;

import java.util.List;

public interface UbussurService {
    List<Ubussur> selectUbussur();

    List<Ubussur> selectUbussurByfk(Integer cityid);
}
