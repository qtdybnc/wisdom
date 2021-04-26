package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.RbusMapper;
import com.zhihuilvxing.domain.Rbus;
import com.zhihuilvxing.service.RbusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RbusServiceImpl implements RbusService {

    @Autowired
    private RbusMapper rbusMapper;
    @Override
    public List<Rbus> selectRbusByfk(Integer cityid) {
        return rbusMapper.selectRbusByfk(cityid);
    }

    @Override
    public List<Rbus> selectRbus() {
        return rbusMapper.selectRbus();
    }

    @Override
    public int addRbus(Rbus rbus) {
        return rbusMapper.addRbus(rbus);
    }
}
