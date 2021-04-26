package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.PcMapper;
import com.zhihuilvxing.domain.Pc;
import com.zhihuilvxing.service.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcServiceImpl implements PcService {

    @Autowired
    private PcMapper mapper;

    @Override
    public List<Pc> selectPc() {
        return mapper.selectPc();
    }
}
