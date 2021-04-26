package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.HdtssurMapper;
import com.zhihuilvxing.domain.Hdtssur;
import com.zhihuilvxing.service.HdtssurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HdtssurServiceImpl implements HdtssurService {
    @Autowired
    private HdtssurMapper mapper;
    @Override
    public List<Hdtssur> selectHdtssurByfk(Integer cityid) {
        return mapper.selectHdtssurByfk(cityid);
    }

    @Override
    public List<Hdtssur> selectHdtssur() {
        return mapper.selectHdtssur();
    }
}
