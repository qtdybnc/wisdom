package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.ParameterEVMapper;
import com.zhihuilvxing.domain.ParameterEV;
import com.zhihuilvxing.service.ParameterEVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParameterEVServiceImpl implements ParameterEVService {
    @Autowired
    private ParameterEVMapper mapper;

    @Override
    public List<ParameterEV> selectParameterEV() {
        return mapper.selectParameterEV();
    }

    @Override
    public List<ParameterEV> selectParameterEVByf(Integer modeid) {
        return mapper.selectParameterEVByf(modeid);
    }
}
