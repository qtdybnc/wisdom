package com.zhihuilvxing.controller;


import com.zhihuilvxing.domain.Ldt2;
import com.zhihuilvxing.service.Ldt2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Ldt2")
public class Ldt2Controller {

    @Autowired
    private Ldt2Service service;

    @RequestMapping("/selectLdt2.do")
    @ResponseBody
    public List<Ldt2> selectLdt2(){
        List<Ldt2> ldt2s = service.selectLdt2();
        return  ldt2s;
    }

    @RequestMapping("/selectLdt2Byfk.do")
    @ResponseBody
    public List<Ldt2> selectLdt2Byfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Ldt2> ldt2s = service.selectLdt2Byfk(cityid);
        return  ldt2s;
    }
}
