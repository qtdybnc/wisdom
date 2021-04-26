package com.zhihuilvxing.service;


import com.zhihuilvxing.domain.Rbussur;

import java.util.List;

public interface RbussurService {
    List<Rbussur> selectRbussurByfk(Integer cityid);
    List<Rbussur> selectRbussur();
}
