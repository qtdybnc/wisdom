package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.RbusmodelMapper;
import com.zhihuilvxing.domain.Rbusmodel;
import com.zhihuilvxing.service.RbusmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RbusmodelServiceImpl implements RbusmodelService {
    @Autowired
    private RbusmodelMapper mapper;
    @Override
    public List<Rbusmodel> selectRbusmodelByfk(Integer cityid) {
        return mapper.selectRbusmodelByfk(cityid);
    }

    @Override
    public List<Rbusmodel> selectRbusmodel() {
        return mapper.selectRbusmodel();
    }
}
