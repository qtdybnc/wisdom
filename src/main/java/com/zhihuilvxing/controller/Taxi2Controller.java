package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Taxi2;
import com.zhihuilvxing.service.Taxi2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Taxi2")
public class Taxi2Controller {
    @Autowired
    private Taxi2Service service;

    @RequestMapping("/selectTaxi2.do")
    @ResponseBody
    public List<Taxi2> selectTaxi2(){
        List<Taxi2> list = service.selectTaxi2();
        return  list;
    }

    @RequestMapping("/selectTaxi2Byfk.do")
    @ResponseBody
    public List<Taxi2> selectTaxi2Byfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Taxi2> list = service.selectTaxi2Byfk(cityid);
        return list;
    }
}
