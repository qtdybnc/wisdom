package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.HdtsurMapper;
import com.zhihuilvxing.domain.Hdtsur;
import com.zhihuilvxing.service.HdtsurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HdtsurServiceImpl implements HdtsurService {

    @Autowired
    private HdtsurMapper mapper;
    @Override
    public List<Hdtsur> selectHdtsurByfk(Integer cityid) {
        return mapper.selectHdtsurByfk(cityid);
    }

    @Override
    public List<Hdtsur> selectHdtsur() {
        return mapper.selectHdtsur();
    }
}
