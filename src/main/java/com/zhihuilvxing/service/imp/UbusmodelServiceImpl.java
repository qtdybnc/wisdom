package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.UbusmodelMapper;
import com.zhihuilvxing.domain.Ubusmodel;
import com.zhihuilvxing.service.UbusmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UbusmodelServiceImpl implements UbusmodelService {
    @Autowired
    private UbusmodelMapper mapper;
    @Override
    public List<Ubusmodel> selectUbusmodel() {
        return mapper.selectUbusmodel();
    }

    @Override
    public List<Ubusmodel> selectUbusmodelByfk(Integer cityid) {
        return mapper.selectUbusmodelByfk(cityid);
    }
}
