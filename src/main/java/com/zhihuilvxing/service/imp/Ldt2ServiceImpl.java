package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.Ldt2Mapper;
import com.zhihuilvxing.domain.Ldt2;
import com.zhihuilvxing.service.Ldt2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Ldt2ServiceImpl implements Ldt2Service {
    @Autowired
    private Ldt2Mapper mapper;
    @Override
    public List<Ldt2> selectLdt2() {
        return mapper.selectLdt2();
    }

    @Override
    public List<Ldt2> selectLdt2Byfk(Integer cityid) {
        return mapper.selectLdt2Byfk(cityid);
    }
}
