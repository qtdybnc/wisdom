package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Ldtsur2;

import java.util.List;

public interface Ldtsur2Service {
    List<Ldtsur2> selectLdtsur2();

    List<Ldtsur2> selectLdtsur2Byfk(Integer cityid);
}
