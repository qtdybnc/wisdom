package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Taxisur;

import java.util.List;

public interface TaxisurService {
    List<Taxisur> selectTaxisur();

    List<Taxisur> selectTaxisurByfk(Integer cityid);
}
