package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.RbussurMapper;
import com.zhihuilvxing.domain.Rbussur;
import com.zhihuilvxing.service.RbussurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RbussurServiceImpl implements RbussurService {
    @Autowired
    private RbussurMapper mapper;

    @Override
    public List<Rbussur> selectRbussurByfk(Integer cityid) {
        return mapper.selectRbussurByfk(cityid);
    }

    @Override
    public List<Rbussur> selectRbussur() {
        return mapper.selectRbussur();
    }
}
