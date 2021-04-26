package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Baumil;

import java.util.List;

public interface BaumilService {
    List<Baumil> selectBaumil();

    List<Baumil> selectBaumilByfk(Integer cityid);
    List<Baumil> selectBaumilByf(Integer modeid);
}
