package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Taxi;

import java.util.List;

public interface TaxiService {
    List<Taxi> selectTaxi();

    List<Taxi> selectTaxiByfk(Integer cityid);
}
