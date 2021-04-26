package com.zhihuilvxing.service;


import com.zhihuilvxing.domain.Pvsur;

import java.util.List;

public interface PvsurService {
    List<Pvsur> selectPvsurByfk(Integer cityid);
    List<Pvsur> selectPvsur();
}
