package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Hdtssur;

import java.util.List;

public interface HdtssurService {
    List<Hdtssur> selectHdtssurByfk(Integer cityid);
    List<Hdtssur> selectHdtssur();
}
