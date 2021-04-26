package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Rbus2Mapper;
import com.zhihuilvxing.domain.Rbus2;
import com.zhihuilvxing.service.Rbus2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Rbus2ServiceImpl implements Rbus2Service {

    @Autowired
    private Rbus2Mapper mapper;
    @Override
    public List<Rbus2> selectRbus2Byfk(Integer cityid) {
        return mapper.selectRbus2Byfk(cityid);
    }

    @Override
    public List<Rbus2> selectRbus2() {
        return mapper.selectRbus2();
    }
}
