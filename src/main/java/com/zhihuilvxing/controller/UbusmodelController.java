package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Ubusmodel;
import com.zhihuilvxing.service.UbusmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Ubusmodel")
public class UbusmodelController {

    @Autowired
    private UbusmodelService service;

    @RequestMapping("/selectUbusmodel.do")
    @ResponseBody
    public List<Ubusmodel> selectUbusmodel(){
        List<Ubusmodel> list = service.selectUbusmodel();
        return  list;
    }

    @RequestMapping("/selectUbusmodelByfk.do")
    @ResponseBody
    public  List<Ubusmodel> selectUbusmodelByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Ubusmodel> list = service.selectUbusmodelByfk(cityid);
        return  list;
    }
}
