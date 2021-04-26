package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.taxisur2;
import com.zhihuilvxing.service.Taxisur2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Taxisur2")
public class Taxisur2Controller {
    @Autowired
    private Taxisur2Service service;

    @RequestMapping("/selectTaxisur2.do")
    @ResponseBody
    public List<taxisur2> selectTaxisur2(){
        List<taxisur2> list = service.selectTaxisur2();
        return list;
    }

    @RequestMapping("/selectTaxisur2Byfk.do")
    @ResponseBody
    public List<taxisur2> selectTaxisur2Byfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<taxisur2> list = service.selectTaxisur2Byfk(cityid);
        return  list;
    }
}
