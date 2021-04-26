package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.HdtmodelMapper;
import com.zhihuilvxing.domain.Hdtmodel;
import com.zhihuilvxing.service.HdtmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HdtmodelServiceImpl implements HdtmodelService {
    @Autowired
    private HdtmodelMapper mapper;
    @Override
    public List<Hdtmodel> selectHdtmodelByfk(Integer cityid) {
        return mapper.selectHdtmodelByfk(cityid);
    }

    @Override
    public List<Hdtmodel> selectHdtmodel() {
        return mapper.selectHdtmodel();
    }
}
