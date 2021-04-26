package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.TaxisurMapper;
import com.zhihuilvxing.domain.Taxisur;
import com.zhihuilvxing.service.TaxisurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaxisurServiceImpl implements TaxisurService {
    @Autowired
    private TaxisurMapper mapper;
    @Override
    public List<Taxisur> selectTaxisur() {
        return mapper.selectTaxisur();
    }

    @Override
    public List<Taxisur> selectTaxisurByfk(Integer cityid) {
        return mapper.selectTaxisurByfk(cityid);
    }
}
