package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Baupd;

import java.util.List;

public interface BaupdService {
    List<Baupd> selectBaupd();

    List<Baupd> selectBaupdByfk(Integer cityid);
}
