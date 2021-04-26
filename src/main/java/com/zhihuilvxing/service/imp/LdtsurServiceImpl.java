package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.LdtmodelMapper;
import com.zhihuilvxing.dao.LdtsurMapper;
import com.zhihuilvxing.domain.Ldtsur;
import com.zhihuilvxing.service.LdtsurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LdtsurServiceImpl implements LdtsurService {
    @Autowired
    private LdtsurMapper mapper;
    @Override
    public List<Ldtsur> selectLdtsur() {
        return mapper.selectLdtsur();
    }

    @Override
    public List<Ldtsur> selectLdtsurByfk(Integer cityid) {
        return mapper.selectLdtsurByfk(cityid);
    }
}
