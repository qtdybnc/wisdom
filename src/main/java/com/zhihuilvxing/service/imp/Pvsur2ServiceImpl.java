package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Pvsur2Mapper;
import com.zhihuilvxing.dao.Rbussur2Mapper;
import com.zhihuilvxing.domain.Pvsur2;
import com.zhihuilvxing.domain.Rbussur2;
import com.zhihuilvxing.service.Pvsur2Service;
import com.zhihuilvxing.service.Rbussur2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Pvsur2ServiceImpl implements Pvsur2Service {
    @Autowired
    private Pvsur2Mapper mapper;



    @Override
    public List<Pvsur2> selectPvsur2Byfk(Integer cityid) {
        return mapper.selectPvsur2Byfk(cityid);
    }

    @Override
    public List<Pvsur2> selectPvsur2() {
        return mapper.selectPvsur2();
    }
}
