package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.LdtmodelMapper;
import com.zhihuilvxing.domain.Ldtmodel;
import com.zhihuilvxing.service.LdtmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LdtmodelServiceImpl implements LdtmodelService {
    @Autowired
    private LdtmodelMapper mapper;

    @Override
    public List<Ldtmodel> selectLdtmodel() {
        return mapper.selectLdtmodel();
    }

    @Override
    public List<Ldtmodel> selectLdtmodelByfk(Integer cityid) {
        return mapper.selectLdtmodelByfk(cityid);
    }
}
