package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Baupd;
import com.zhihuilvxing.domain.Ldt;
import com.zhihuilvxing.service.BaupdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Baupd")
public class BaupdController {
    @Autowired
    private BaupdService service;

    @RequestMapping("/selectBaupd.do")
    @ResponseBody
    public List<Baupd> selectBaupd(){
        List<Baupd> list = service.selectBaupd();
        return list;
    }

    @RequestMapping("/selectBaupdByfk.do")
    @ResponseBody
    public List<Baupd> selectBaupdByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Baupd> list = service.selectBaupdByfk(cityid);
        return list;
    }
}
