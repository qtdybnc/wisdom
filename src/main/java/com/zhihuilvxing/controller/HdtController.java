package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Hdt;
import com.zhihuilvxing.service.HdtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Hdt")
public class HdtController {

    @Autowired
   private HdtService service;

    @RequestMapping("/selectHdtByfk.do")
    @ResponseBody
    public List<Hdt> selectHdtByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Hdt> hdts = service.selectHdtByfk(cityid);
        return hdts;
    }

    @RequestMapping("/selectHdt.do")
    @ResponseBody
    public List<Hdt> selectHdt(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        System.out.println(cityid);
        List<Hdt> hdts = service.selectHdt();
        return hdts;
    }
}
