package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.ParameterEV;
import com.zhihuilvxing.service.ParameterEVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/ParameterEV")
public class ParameterEVController {
    @Autowired
    private ParameterEVService service;

    @RequestMapping("/selectParameterEV")
    @ResponseBody
    public List<ParameterEV> selectParameterEV(){
        List<ParameterEV> parameterEVs = service.selectParameterEV();
        return parameterEVs;
    }

    @RequestMapping("/selectParameterEVByf")
    @ResponseBody
    public List<ParameterEV> selectParameterEVByf(String modeid){
        List<ParameterEV> parameterEVs = service.selectParameterEVByf(Integer.valueOf(modeid));
        return parameterEVs;
    }
}
