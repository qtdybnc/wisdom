package com.zhihuilvxing.controller;



import com.zhihuilvxing.domain.Pc;
import com.zhihuilvxing.service.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/Pc")
public class PcController {

    @Autowired
    private PcService service;

    @RequestMapping("/selectPc.do")
    @ResponseBody
    public List<Pc> selectPc(){
        List<Pc> list = service.selectPc();
        return  list;
    }
}
