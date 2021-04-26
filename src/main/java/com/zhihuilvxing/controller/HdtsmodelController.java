package com.zhihuilvxing.controller;


import com.zhihuilvxing.domain.Hdtsmodel;
import com.zhihuilvxing.service.HdtsmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Hdtsmodel")
public class HdtsmodelController {

    @Autowired
   private HdtsmodelService service;

    @RequestMapping("/selectHdtsmodelByfk.do")
    @ResponseBody
    public List<Hdtsmodel> selectHdtsmodelByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Hdtsmodel> Hdtsmodels = service.selectHdtsmodelByfk(cityid);
        return Hdtsmodels;
    }

    @RequestMapping("/selectHdtsmodel.do")
    @ResponseBody
    public List<Hdtsmodel> selectHdtsmodel(){
        List<Hdtsmodel> Hdtsmodels = service.selectHdtsmodel();
        return Hdtsmodels;
    }
}
