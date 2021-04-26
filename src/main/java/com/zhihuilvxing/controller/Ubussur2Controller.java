package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Ubussur2;
import com.zhihuilvxing.service.Ubussur2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Ubussur2")
public class Ubussur2Controller {
    @Autowired
    private Ubussur2Service service;

    @RequestMapping("/selectUbussur2.do")
    @ResponseBody
    public List<Ubussur2> selectUbussur2(){
        List<Ubussur2> list = service.selectUbussur2();
        return  list;
    }

    @RequestMapping("/selectUbussur2Byfk.do")
    @ResponseBody
    public List<Ubussur2> selectUbussur2Byfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Ubussur2> list = service.selectUbussur2Byfk(cityid);
        return list;
    }
 }
