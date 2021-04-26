package com.zhihuilvxing.service;


import com.zhihuilvxing.domain.Hdts;

import java.util.List;

public interface HdtsService {
    List<Hdts> selectHdtsByfk(Integer cityid);
    List<Hdts> selectHdts();
}
