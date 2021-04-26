package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Rbusmodel;

import java.util.List;

public interface RbusmodelService{
    List<Rbusmodel> selectRbusmodelByfk(Integer cityid);
    List<Rbusmodel> selectRbusmodel();
}
