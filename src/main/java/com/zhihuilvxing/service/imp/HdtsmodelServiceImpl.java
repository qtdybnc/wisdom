package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.HdtsmodelMapper;
import com.zhihuilvxing.domain.Hdtsmodel;
import com.zhihuilvxing.service.HdtsmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HdtsmodelServiceImpl implements HdtsmodelService {
    @Autowired
    private HdtsmodelMapper mapper;
    @Override
    public List<Hdtsmodel> selectHdtsmodelByfk(Integer cityid) {
        return mapper.selectHdtsmodelByfk(cityid);
    }

    @Override
    public List<Hdtsmodel> selectHdtsmodel() {
        return mapper.selectHdtsmodel();
    }
}
