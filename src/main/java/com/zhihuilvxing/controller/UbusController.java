package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Ubus;
import com.zhihuilvxing.service.UbusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Ubus")
public class UbusController {

    @Autowired
    private UbusService service;

    @RequestMapping("/selectUbus.do")
    @ResponseBody
    public List<Ubus> selectUbus(){
        List<Ubus> list = service.selectUbus();
        return list;
    }

    @RequestMapping("/selectUbusByfk.do")
    @ResponseBody
    public List<Ubus> selectUbusByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Ubus> list = service.selectUbusByfk(cityid);
        return  list;
    }
}
