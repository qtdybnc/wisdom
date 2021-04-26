package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Bauev;

import java.util.List;

public interface BauevService {
    List<Bauev> selectBauev();

    List<Bauev> selectBauevByfk(Integer cityid);
}
