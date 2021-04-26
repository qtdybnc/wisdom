package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Ubus2Mapper;
import com.zhihuilvxing.domain.Ubus2;
import com.zhihuilvxing.service.Ubus2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Ubus2ServiceImpl implements Ubus2Service {
    @Autowired
    private Ubus2Mapper mapper;
    @Override
    public List<Ubus2> selectUbus2() {
        return mapper.selectUbus2();
    }

    @Override
    public List<Ubus2> selectUbus2Byfk(Integer cityid) {
        return mapper.selectUbus2Byfk(cityid);
    }
}
