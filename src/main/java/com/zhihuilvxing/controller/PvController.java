package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Pv;
import com.zhihuilvxing.domain.Rbus;
import com.zhihuilvxing.service.PvService;
import com.zhihuilvxing.service.RbusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Pv")
public class PvController {
    @Autowired
    private PvService service;

    @RequestMapping("/selectPvByfk.do")
    @ResponseBody
    public List<Pv> selectPvByfk(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Pv> pvs = service.selectPvByfk(cityid);
        return  pvs;
    }

    @RequestMapping("/selectPv.do")
    @ResponseBody
    public List<Pv> selectPv() {
        List<Pv> pvs = service.selectPv();
        return  pvs;
    }
}
