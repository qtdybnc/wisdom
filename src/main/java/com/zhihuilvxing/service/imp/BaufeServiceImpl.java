package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.BaufeMapper;
import com.zhihuilvxing.domain.Baufe;
import com.zhihuilvxing.service.BaufeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BaufeServiceImpl implements BaufeService {
    @Autowired
    private BaufeMapper mapper;
    @Override
    public List<Baufe> selectBaufe() {
        return mapper.selectBaufe();
    }

    @Override
    public List<Baufe> selectBaufeByf(Integer modeid) {
        return mapper.selectBaufeByf(modeid);
    }

    @Override
    public List<Baufe> selectBaufeByfk(Integer cityid) {
        return mapper.selectBaufeByfk(cityid);
    }
}
