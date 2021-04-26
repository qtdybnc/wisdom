package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Hdtssur2Mapper;
import com.zhihuilvxing.domain.Hdtssur2;
import com.zhihuilvxing.service.Hdtssur2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Hdtssur2ServiceImpl implements Hdtssur2Service {
    @Autowired
    private Hdtssur2Mapper mapper;
    @Override
    public List<Hdtssur2> selectHdtssur2Byfk(Integer cityid) {
        return mapper.selectHdtssur2Byfk(cityid);
    }

    @Override
    public List<Hdtssur2> selectHdtssur2() {
        return mapper.selectHdtssur2();
    }
}
