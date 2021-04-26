package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.PvmodelMapper;
import com.zhihuilvxing.dao.RbusmodelMapper;
import com.zhihuilvxing.domain.Pvmodel;
import com.zhihuilvxing.service.PvmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PvmodelServiceImpl implements PvmodelService {
    @Autowired
    private PvmodelMapper mapper;

    @Override
    public List<Pvmodel> selectPvmodelByfk(Integer cityid) {
        return mapper.selectPvmodelByfk(cityid);
    }



    @Override
    public List<Pvmodel> selectPvmodel() {
        return mapper.selectPvmodel();
    }
}
