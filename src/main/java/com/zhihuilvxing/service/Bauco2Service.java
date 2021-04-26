package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Bauco2;

import java.util.List;

public interface Bauco2Service {
    List<Bauco2> selectBauco2();

    List<Bauco2> selectBauco2Byfk(Integer cityid);
}
