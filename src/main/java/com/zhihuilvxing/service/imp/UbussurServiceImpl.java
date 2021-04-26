package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.UbussurMapper;
import com.zhihuilvxing.domain.Ubussur;
import com.zhihuilvxing.service.UbussurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UbussurServiceImpl implements UbussurService {
    @Autowired
    private UbussurMapper mapper;
    @Override
    public List<Ubussur> selectUbussur() {
        return mapper.selectUbussur();
    }

    @Override
    public List<Ubussur> selectUbussurByfk(Integer cityid) {
        return mapper.selectUbussurByfk(cityid);
    }
}
