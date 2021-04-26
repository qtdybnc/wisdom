package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.ModeMapper;
import com.zhihuilvxing.domain.Mode;
import com.zhihuilvxing.service.ModeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeServiceImpl implements ModeService {
    @Autowired
    private ModeMapper mapper;
    @Override
    public List<Mode> selectMode() {
        return mapper.selectMode();
    }
}
