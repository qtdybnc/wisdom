package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Pvmodel;
import com.zhihuilvxing.domain.Rbusmodel;

import java.util.List;

public interface PvmodelService {
    List<Pvmodel> selectPvmodelByfk(Integer cityid);
    List<Pvmodel> selectPvmodel();
}
