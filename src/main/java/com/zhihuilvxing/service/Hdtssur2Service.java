package com.zhihuilvxing.service;


import com.zhihuilvxing.domain.Hdtssur2;

import java.util.List;

public interface Hdtssur2Service {
    List<Hdtssur2> selectHdtssur2Byfk(Integer cityid);
    List<Hdtssur2> selectHdtssur2();
}
