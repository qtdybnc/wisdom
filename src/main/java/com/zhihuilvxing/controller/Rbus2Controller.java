package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Rbus2;
import com.zhihuilvxing.service.Rbus2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Rbus2")
public class Rbus2Controller {
    @Autowired
    private Rbus2Service service;

    @RequestMapping("/selectRbus2Byfk.do")
    @ResponseBody
    public List<Rbus2> selectRbus2Byfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Rbus2> list = service.selectRbus2Byfk(cityid);
        return  list;
    }

    @RequestMapping("/selectRbus2.do")
    @ResponseBody
    public List<Rbus2> selectRbus2(){
        List<Rbus2> list = service.selectRbus2();
        return  list;
    }
}
