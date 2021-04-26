package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Hdt;

import java.util.List;

public interface HdtService {
    List<Hdt> selectHdtByfk(Integer cityid);
    List<Hdt> selectHdt();
}
