package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.LdtMapper;
import com.zhihuilvxing.domain.Ldt;
import com.zhihuilvxing.service.LdtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LdtServiceImpl implements LdtService {
    @Autowired
    private LdtMapper mapper;
    @Override
    public List<Ldt> selectLdt() {
        return mapper.selectLdt();
    }

    @Override
    public List<Ldt> selectLdtByfk(Integer cityid) {
        return mapper.selectLdtByfk(cityid);
    }
}
