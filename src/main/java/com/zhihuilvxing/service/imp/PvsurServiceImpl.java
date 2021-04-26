package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.PvsurMapper;
import com.zhihuilvxing.domain.Pvsur;
import com.zhihuilvxing.service.PvsurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PvsurServiceImpl implements PvsurService {
    @Autowired
    private PvsurMapper mapper;


    @Override
    public List<Pvsur> selectPvsurByfk(Integer cityid) {
        return mapper.selectPvsurByfk(cityid);
    }

    @Override
    public List<Pvsur> selectPvsur() {
        return mapper.selectPvsur();
    }
}
