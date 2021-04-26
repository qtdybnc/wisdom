package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Bauco2;
import com.zhihuilvxing.service.Bauco2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Bauco2")
public class Bauco2Controller {
    @Autowired
    private Bauco2Service service;

    @RequestMapping("/selectBauco2.do")
    @ResponseBody
    public List<Bauco2> selectBauco2(){
        List<Bauco2> list = service.selectBauco2();
        return list;
    }

    @RequestMapping("/selectBauco2Byfk.do")
    @ResponseBody
    public List<Bauco2> selectBauco2Byfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Bauco2> list = service.selectBauco2Byfk(cityid);
        return list;
    }
}
