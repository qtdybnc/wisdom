package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Pv;
import com.zhihuilvxing.domain.Pv2;
import com.zhihuilvxing.service.Pv2Service;
import com.zhihuilvxing.service.PvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Pv2")
public class Pv2Controller {
    @Autowired
    private Pv2Service service;

    @RequestMapping("/selectPv2Byfk.do")
    @ResponseBody
    public List<Pv2> selectPv2Byfk(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Pv2> pv2s = service.selectPv2Byfk(cityid);
        return  pv2s;
    }

    @RequestMapping("/selectPv2.do")
    @ResponseBody
    public List<Pv2> selectPv() {
        List<Pv2> pv2s = service.selectPv2();
        return  pv2s;
    }
}
