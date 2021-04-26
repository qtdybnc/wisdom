package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Bau1;
import com.zhihuilvxing.service.Bau1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Bau1")
public class Bau1Controller {

    @Autowired
    private Bau1Service service;

    @RequestMapping("/selectBau1.do")
    @ResponseBody
    public List<Bau1> selectBau1(){
        List<Bau1> list = service.selectBau1();
        return list;
    }

    @RequestMapping("/selectBau1Byfk.do")
    @ResponseBody
    public List<Bau1> selectBau1Byfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Bau1> list =service.selectBau1Byfk(cityid);
        return list;
    }
}
