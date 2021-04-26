package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Bauco2Mapper;
import com.zhihuilvxing.domain.Bauco2;
import com.zhihuilvxing.service.Bauco2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Bauco2ServiceImpl implements Bauco2Service {
    @Autowired
    private Bauco2Mapper mapper;
    @Override
    public List<Bauco2> selectBauco2() {
        return mapper.selectBauco2();
    }

    @Override
    public List<Bauco2> selectBauco2Byfk(Integer cityid) {
        return mapper.selectBauco2Byfk(cityid);
    }
}
