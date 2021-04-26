package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Pv;


import java.util.List;

public interface PvService {
    List<Pv> selectPvByfk(Integer cityid);
    List<Pv> selectPv();

}
