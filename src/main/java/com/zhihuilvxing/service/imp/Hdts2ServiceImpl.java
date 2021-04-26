package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Hdts2Mapper;
import com.zhihuilvxing.domain.Hdts2;
import com.zhihuilvxing.service.Hdts2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Hdts2ServiceImpl implements Hdts2Service {

    @Autowired
    private Hdts2Mapper mapper;

    @Override
    public List<Hdts2> selectHdts2Byfk(Integer cityid) {
        return mapper.selectHdts2Byfk(cityid);
    }

    @Override
    public List<Hdts2> selectHdts2() {
        return mapper.selectHdts2();
    }
}
