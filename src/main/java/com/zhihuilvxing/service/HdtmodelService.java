package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Hdtmodel;

import java.util.List;

public interface HdtmodelService {
    List<Hdtmodel> selectHdtmodelByfk(Integer cityid);
    List<Hdtmodel> selectHdtmodel();
}
