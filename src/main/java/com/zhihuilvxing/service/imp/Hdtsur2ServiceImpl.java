package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Hdtsur2Mapper;
import com.zhihuilvxing.domain.Hdtsur2;
import com.zhihuilvxing.service.Hdtsur2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Hdtsur2ServiceImpl implements Hdtsur2Service {
    @Autowired
    private Hdtsur2Mapper mapper;

    @Override
    public List<Hdtsur2> selectHdtsur2Byfk(Integer cityid) {
        return mapper.selectHdtsur2Byfk(cityid);
    }

    @Override
    public List<Hdtsur2> selectHdtsur2() {
        return mapper.selectHdtsur2();
    }
}
