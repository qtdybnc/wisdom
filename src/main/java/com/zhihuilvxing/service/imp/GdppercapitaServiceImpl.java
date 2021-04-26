package com.zhihuilvxing.service.imp;

import com.zhihuilvxing.dao.GdppercapitaMapper;
import com.zhihuilvxing.domain.Gdppercapita;
import com.zhihuilvxing.service.GdppercapitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GdppercapitaServiceImpl implements GdppercapitaService {

    @Autowired
    private GdppercapitaMapper mapper;
    @Override
    public List<Gdppercapita> selectGdppercapita(Integer provinceid) {
        return mapper.selectByPrimaryKey(provinceid);
    }
}
