package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.HdtsMapper;
import com.zhihuilvxing.domain.Hdts;
import com.zhihuilvxing.service.HdtsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HdtsServiceImpl implements HdtsService {
    @Autowired
    private HdtsMapper mapper;
    @Override
    public List<Hdts> selectHdtsByfk(Integer cityid) {
        return mapper.selectHdtsByfk(cityid);
    }

    @Override
    public List<Hdts> selectHdts() {
        return mapper.selectHdts();
    }
}
