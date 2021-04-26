package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.PvMapper;

import com.zhihuilvxing.domain.Pv;

import com.zhihuilvxing.service.PvService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PvServiceImpl implements PvService {

    @Autowired
    private PvMapper pvMapper;

    @Override
    public List<Pv> selectPvByfk(Integer cityid) {
        return pvMapper.selectPvByfk(cityid);
    }

    @Override
    public List<Pv> selectPv() {
        return pvMapper.selectPv();
    }
}
