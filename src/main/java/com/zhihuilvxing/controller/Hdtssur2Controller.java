package com.zhihuilvxing.controller;


import com.zhihuilvxing.domain.Hdtssur2;

import com.zhihuilvxing.service.Hdtssur2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Hdtssur2")
public class Hdtssur2Controller {

    @Autowired
   private Hdtssur2Service service;

    @RequestMapping("/selectHdtssur2Byfk.do")
    @ResponseBody
    public List<Hdtssur2> selectHdtssur2Byfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Hdtssur2> Hdtssur2s = service.selectHdtssur2Byfk(cityid);
        return Hdtssur2s;
    }

    @RequestMapping("/selectHdtssur2.do")
    @ResponseBody
    public List<Hdtssur2> selectHdtssur2(){
        List<Hdtssur2> Hdtssur2s = service.selectHdtssur2();
        return Hdtssur2s;
    }
}
