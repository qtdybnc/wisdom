package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.BauofMapper;
import com.zhihuilvxing.domain.Bauof;
import com.zhihuilvxing.service.BauofService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BauofServiceImpl implements BauofService {
    @Autowired
    private BauofMapper mapper;
    @Override
    public List<Bauof> selectBauof() {
        return mapper.selectBauof();
    }

    @Override
    public List<Bauof> selectBauofByfk(Integer cityid) {
        return mapper.selectBauofByfk(cityid);
    }
}
