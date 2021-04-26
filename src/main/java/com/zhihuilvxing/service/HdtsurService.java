package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Hdtsur;

import java.util.List;

public interface HdtsurService {
    List<Hdtsur> selectHdtsurByfk(Integer cityid);
    List<Hdtsur> selectHdtsur();
}
