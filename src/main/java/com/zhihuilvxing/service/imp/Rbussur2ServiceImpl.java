package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Rbussur2Mapper;
import com.zhihuilvxing.domain.Rbussur2;
import com.zhihuilvxing.service.Rbussur2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Rbussur2ServiceImpl implements Rbussur2Service {
    @Autowired
    private Rbussur2Mapper mapper;

    @Override
    public List<Rbussur2> selectRbussur2Byfk(Integer cityid) {
       return mapper.selectRbussur2Byfk(cityid);
    }

    @Override
    public List<Rbussur2> selectRbussur2() {
        return mapper.selectRbussur2();
    }

}
