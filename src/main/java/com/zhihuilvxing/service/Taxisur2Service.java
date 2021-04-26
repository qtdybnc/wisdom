package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.taxisur2;

import java.util.List;

public interface Taxisur2Service {
    List<taxisur2> selectTaxisur2();

    List<taxisur2> selectTaxisur2Byfk(Integer cityid);
}
