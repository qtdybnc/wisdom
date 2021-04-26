package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Ubussur2Mapper;
import com.zhihuilvxing.domain.Ubussur2;
import com.zhihuilvxing.service.Ubussur2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Ubussur2ServiceImpl implements Ubussur2Service {
    @Autowired
    private Ubussur2Mapper mapper;
    @Override
    public List<Ubussur2> selectUbussur2() {
        return mapper.selectUbussur2();
    }

    @Override
    public List<Ubussur2> selectUbussur2Byfk(Integer cityid) {
        return mapper.selectUbussur2Byfk(cityid);
    }
}
