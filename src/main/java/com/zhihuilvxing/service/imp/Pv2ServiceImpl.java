package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Pv2Mapper;
import com.zhihuilvxing.dao.PvMapper;
import com.zhihuilvxing.domain.Pv;
import com.zhihuilvxing.domain.Pv2;
import com.zhihuilvxing.service.Pv2Service;
import com.zhihuilvxing.service.PvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Pv2ServiceImpl implements Pv2Service {

    @Autowired
    private Pv2Mapper rbusMapper;


    @Override
    public List<Pv2> selectPv2Byfk(Integer cityid) {
        return rbusMapper.selectPv2Byfk(cityid);
    }

    @Override
    public List<Pv2> selectPv2() {
        return rbusMapper.selectPv2();
    }
}
