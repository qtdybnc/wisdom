package com.zhihuilvxing.controller;


import com.zhihuilvxing.domain.Hdtmodel;
import com.zhihuilvxing.service.HdtmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Hdtmodel")
public class HdtmodelController {
    @Autowired
    private HdtmodelService service;


    @RequestMapping("/selectHdtmodelByfk.do")
    @ResponseBody
    public List<Hdtmodel> selectHdtmodelByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Hdtmodel> hdtmodels = service.selectHdtmodelByfk(cityid);
        return hdtmodels;
    }
    @RequestMapping("/selectHdtmodel.do")
    @ResponseBody
    public List<Hdtmodel> selectHdtmodel(){
        List<Hdtmodel> hdtmodels = service.selectHdtmodel();
        return hdtmodels;
    }
}
