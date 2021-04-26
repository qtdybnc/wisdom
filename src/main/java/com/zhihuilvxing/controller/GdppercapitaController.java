package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Gdppercapita;
import com.zhihuilvxing.service.GdppercapitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Gdppercapita")
public class GdppercapitaController {

    @Autowired
    private GdppercapitaService service;

    @RequestMapping("/selectGdppercapita.do")
    @ResponseBody
    public List<Gdppercapita> selectGdppercapita(String provinceid){
        List<Gdppercapita> list = service.selectGdppercapita(Integer.valueOf(provinceid));
        return list;
    }
}
