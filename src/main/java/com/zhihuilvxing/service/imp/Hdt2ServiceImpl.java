package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Hdt2Mapper;
import com.zhihuilvxing.domain.Hdt2;
import com.zhihuilvxing.service.Hdt2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Hdt2ServiceImpl implements Hdt2Service {

    @Autowired
    private Hdt2Mapper mapper;

    @Override
    public List<Hdt2> selectHdt2Byfk(Integer cityid) {
        return mapper.selectHdt2Byfk(cityid);
    }

    @Override
    public List<Hdt2> selectHdt2() {
        return mapper.selectHdt2();
    }
}
