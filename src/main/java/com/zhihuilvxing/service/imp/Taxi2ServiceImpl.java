package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Taxi2Mapper;
import com.zhihuilvxing.domain.Taxi2;
import com.zhihuilvxing.service.Taxi2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Taxi2ServiceImpl implements Taxi2Service {
    @Autowired
    private Taxi2Mapper mapper;

    @Override
    public List<Taxi2> selectTaxi2() {
        return mapper.selectTaxi2();
    }

    @Override
    public List<Taxi2> selectTaxi2Byfk(Integer cityid) {
        return mapper.selectTaxi2Byfk(cityid);
    }
}
