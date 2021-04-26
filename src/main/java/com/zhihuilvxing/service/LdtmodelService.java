package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Ldtmodel;

import java.util.List;

public interface LdtmodelService {
    List<Ldtmodel> selectLdtmodel();

    List<Ldtmodel> selectLdtmodelByfk(Integer cityid);
}
