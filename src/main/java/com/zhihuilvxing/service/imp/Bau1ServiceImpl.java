package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Bau1Mapper;
import com.zhihuilvxing.domain.Bau1;
import com.zhihuilvxing.service.Bau1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Bau1ServiceImpl implements Bau1Service {
    @Autowired
    private Bau1Mapper mapper;
    @Override
    public List<Bau1> selectBau1() {
        return mapper.selectBau1();
    }

    @Override
    public List<Bau1> selectBau1Byfk(Integer cityid) {
        return mapper.selectBau1Byfk(cityid);
    }
}
