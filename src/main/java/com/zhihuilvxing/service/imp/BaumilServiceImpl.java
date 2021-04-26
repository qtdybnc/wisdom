package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.BaumilMapper;
import com.zhihuilvxing.domain.Baumil;
import com.zhihuilvxing.service.BaumilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BaumilServiceImpl implements BaumilService {
    @Autowired
    private BaumilMapper mapper;
    @Override
    public List<Baumil> selectBaumil() {
        return mapper.selectBaumil();
    }

    @Override
    public List<Baumil> selectBaumilByf(Integer modeid) {
        return mapper.selectBaumilByf(modeid);
    }

    @Override
    public List<Baumil> selectBaumilByfk(Integer cityid) {
        return mapper.selectBaumilByfk(cityid);
    }
}
