package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Pvsur2;
import com.zhihuilvxing.service.Pvsur2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Pvsur2")
public class Pvsur2Controller {
    @Autowired
    private Pvsur2Service service;

    @RequestMapping("/selectPvsur2Byfk.do")
    @ResponseBody
    public List<Pvsur2> selectPvsur2Byfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Pvsur2> pvsur2s = service.selectPvsur2Byfk(cityid);
        return  pvsur2s;
    }

    @RequestMapping("/selectPvsur2.do")
    @ResponseBody
    public List<Pvsur2> selectPvsur2(){
        List<Pvsur2> pvsur2s = service.selectPvsur2();
        return  pvsur2s;
    }
}
