package com.zhihuilvxing.service;

import com.zhihuilvxing.domain.Gdppercapita;

import java.util.List;

public interface GdppercapitaService {
    List<Gdppercapita> selectGdppercapita(Integer provinceid);
}
