package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Hdtsmodel;

import java.util.List;

public interface HdtsmodelService {
    List<Hdtsmodel> selectHdtsmodelByfk(Integer cityid);
    List<Hdtsmodel> selectHdtsmodel();
}
