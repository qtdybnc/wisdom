package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Hdtsur;
import com.zhihuilvxing.service.HdtsurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Hdtsur")
public class HdtsurController {

    @Autowired
    private HdtsurService service;

    @RequestMapping("/selectHdtsurByfk.do")
    @ResponseBody
    public List<Hdtsur> selectHdtsurByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Hdtsur> hdtsurs = service.selectHdtsurByfk(cityid);
        return hdtsurs;
    }

    @RequestMapping("/selectHdtsur.do")
    @ResponseBody
    public List<Hdtsur> selectHdtsur(String cityid){
        List<Hdtsur> hdtsurs = service.selectHdtsur();
        return hdtsurs;
    }

}
