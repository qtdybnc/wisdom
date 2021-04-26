package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Hdtsur2;
import com.zhihuilvxing.service.Hdtsur2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Hdtsur2")
public class Hdtsur2Controller {
    @Autowired
    private Hdtsur2Service service;

    @RequestMapping("/selectHdtsur2Byfk.do")
    @ResponseBody
    public List<Hdtsur2> selectHdtsur2Byfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Hdtsur2> hdtsur2s = service.selectHdtsur2Byfk(cityid);
        return hdtsur2s;
    }

    @RequestMapping("/selectHdtsur2.do")
    @ResponseBody
    public List<Hdtsur2> selectHdtsur2(String cityid){
        List<Hdtsur2> hdtsur2s = service.selectHdtsur2();
        return hdtsur2s;
    }
}
