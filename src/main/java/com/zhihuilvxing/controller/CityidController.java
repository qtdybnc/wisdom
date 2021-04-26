package com.zhihuilvxing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Cityid")
public class CityidController {

    @RequestMapping("/cityid.do")
    public void cityid(String cityid, HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("cityid",Integer.valueOf(cityid));
    }
}
