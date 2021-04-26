package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.BauevMapper;
import com.zhihuilvxing.domain.Bauev;
import com.zhihuilvxing.service.BauevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BauevServiceImpl implements BauevService {
    @Autowired
    private BauevMapper mapper;
    @Override
    public List<Bauev> selectBauev() {
        return mapper.selectBauev();
    }

    @Override
    public List<Bauev> selectBauevByfk(Integer cityid) {
        return mapper.selectBauevByfk(cityid);
    }
}
