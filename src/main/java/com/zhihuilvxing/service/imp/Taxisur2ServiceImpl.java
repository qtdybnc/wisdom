package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.taxisur2Mapper;
import com.zhihuilvxing.domain.taxisur2;
import com.zhihuilvxing.service.Taxisur2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Taxisur2ServiceImpl implements Taxisur2Service {
    @Autowired
    private taxisur2Mapper mapper;

    @Override
    public List<taxisur2> selectTaxisur2() {
        return mapper.selectTaxisur2();
    }

    @Override
    public List<taxisur2> selectTaxisur2Byfk(Integer cityid) {
        return mapper.selectTaxisur2Byfk(cityid);
    }
}
