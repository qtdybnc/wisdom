package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Ldtmodel;
import com.zhihuilvxing.service.LdtmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Ldtmodel")
public class LdtmodelController {
    @Autowired
    private LdtmodelService service;

    @RequestMapping("/selectLdtmodel.do")
    @ResponseBody
    public List<Ldtmodel> selectLdtmodel(){
        List<Ldtmodel> ldtmodels = service.selectLdtmodel();
        return  ldtmodels;
    }

    @RequestMapping("/selectLdtmodelByfk.do")
    @ResponseBody
    public List<Ldtmodel> selectLdtmodelByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Ldtmodel> ldtmodels = service.selectLdtmodelByfk(cityid);
        return ldtmodels;
    }
}
