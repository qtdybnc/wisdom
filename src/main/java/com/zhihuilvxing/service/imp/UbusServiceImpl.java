package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.UbusMapper;
import com.zhihuilvxing.domain.Ubus;
import com.zhihuilvxing.service.UbusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UbusServiceImpl implements UbusService {

    @Autowired
    private UbusMapper mapper;
    @Override
    public List<Ubus> selectUbus() {
        return mapper.selectUbus();
    }

    @Override
    public List<Ubus> selectUbusByfk(Integer cityid) {
        return mapper.selectUbusByfk(cityid);
    }
}
