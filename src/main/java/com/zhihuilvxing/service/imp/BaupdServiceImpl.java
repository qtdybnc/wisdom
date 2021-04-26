package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.BaupdMapper;
import com.zhihuilvxing.domain.Baupd;
import com.zhihuilvxing.service.BaupdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BaupdServiceImpl implements BaupdService {
    @Autowired
    private BaupdMapper mapper;
    @Override
    public List<Baupd> selectBaupd() {
        return mapper.selectBaupd();
    }

    @Override
    public List<Baupd> selectBaupdByfk(Integer cityid) {
        return mapper.selectBaupdByfk(cityid);
    }
}
