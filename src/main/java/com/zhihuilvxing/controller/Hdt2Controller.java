package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Hdt2;
import com.zhihuilvxing.service.Hdt2Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Hdt2")
public class Hdt2Controller {
    @Autowired
    private Hdt2Service service;

    @RequestMapping("/selectHdt2Byfk.do")
    @ResponseBody
    public List<Hdt2> selectHdt2Byfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Hdt2> hdt2s = service.selectHdt2Byfk(cityid);
        return hdt2s;
    }

    @RequestMapping("/selectHdt2.do")
    @ResponseBody
    public List<Hdt2> selectHdt2(){
        List<Hdt2> hdt2s = service.selectHdt2();
        return hdt2s;
    }

}
