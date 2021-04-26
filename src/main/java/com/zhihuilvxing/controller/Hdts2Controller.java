package com.zhihuilvxing.controller;


import com.zhihuilvxing.domain.Hdts2;
import com.zhihuilvxing.service.Hdts2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Hdts2")
public class Hdts2Controller {

    @Autowired
   private Hdts2Service service;

    @RequestMapping("/selectHdts2Byfk.do")
    @ResponseBody
    public List<Hdts2> selectHdts2Byfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Hdts2> hdtss2 = service.selectHdts2Byfk(cityid);
        return hdtss2;
    }

    @RequestMapping("/selectHdts2.do")
    @ResponseBody
    public List<Hdts2> selectHdt(){
        List<Hdts2> hdtss2 = service.selectHdts2();
        return hdtss2;
    }
}
