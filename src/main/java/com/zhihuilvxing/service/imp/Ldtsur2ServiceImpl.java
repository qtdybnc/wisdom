package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Ldtsur2Mapper;
import com.zhihuilvxing.domain.Ldtsur2;
import com.zhihuilvxing.service.Ldtsur2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Ldtsur2ServiceImpl implements Ldtsur2Service {
    @Autowired
    private Ldtsur2Mapper mapper;

    @Override
    public List<Ldtsur2> selectLdtsur2() {
        return mapper.selectLdtsur2();
    }

    @Override
    public List<Ldtsur2> selectLdtsur2Byfk(Integer cityid) {
        return mapper.selectLdtsur2Byfk(cityid);
    }
}
