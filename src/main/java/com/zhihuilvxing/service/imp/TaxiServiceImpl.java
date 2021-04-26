package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.TaxiMapper;
import com.zhihuilvxing.domain.Taxi;
import com.zhihuilvxing.service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaxiServiceImpl implements TaxiService {
    @Autowired
    private TaxiMapper mapper;
    @Override
    public List<Taxi> selectTaxi() {
        return mapper.selectTaxi();
    }

    @Override
    public List<Taxi> selectTaxiByfk(Integer cityid) {
        return mapper.selectTaxiByfk(cityid);
    }
}
