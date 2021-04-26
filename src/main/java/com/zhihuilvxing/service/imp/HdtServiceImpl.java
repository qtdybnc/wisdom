package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.HdtMapper;
import com.zhihuilvxing.domain.Hdt;
import com.zhihuilvxing.service.HdtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HdtServiceImpl implements HdtService {
    @Autowired
    private HdtMapper mapper;

    @Override
    public List<Hdt> selectHdtByfk(Integer cityid) {
        return mapper.selectHdtByfk(cityid);
    }

    @Override
    public List<Hdt> selectHdt() {
        return mapper.selectHdt();
    }
}
