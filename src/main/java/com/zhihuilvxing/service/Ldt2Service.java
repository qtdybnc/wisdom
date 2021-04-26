package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Ldt2;

import java.util.List;

public interface Ldt2Service {
    List<Ldt2> selectLdt2();

    List<Ldt2> selectLdt2Byfk(Integer cityid);
}
