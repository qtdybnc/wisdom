package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Ldtsur;

import java.util.List;

public interface LdtsurService {
    List<Ldtsur> selectLdtsur();

    List<Ldtsur> selectLdtsurByfk(Integer cityid);
}
