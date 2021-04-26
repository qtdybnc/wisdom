package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Ldt;

import java.util.List;

public interface LdtService
{
    List<Ldt> selectLdt();

    List<Ldt> selectLdtByfk(Integer cityid);
}
