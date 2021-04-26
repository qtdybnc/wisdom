package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Ubus2;
import com.zhihuilvxing.service.Ubus2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Ubus2")
public class Ubus2Controller {

    @Autowired
    private Ubus2Service service;

    @RequestMapping("/selectUbus2.do")
    @ResponseBody
    public List<Ubus2> selectUbus2(){
        List<Ubus2> list = service.selectUbus2();
        return  list;
    }

    @RequestMapping("/selectUbus2Byfk.do")
    @ResponseBody
    public List<Ubus2> selectUbus2Byfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Ubus2> list = service.selectUbus2Byfk(cityid);
        return  list;
    }
}
