package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Pvsur;

import com.zhihuilvxing.service.PvsurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Pvsur")
public class PvsurController {
    @Autowired
    private PvsurService service;

    @RequestMapping("/selectPvsurByfk.do")
    @ResponseBody
    public List<Pvsur> selectPvsurByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Pvsur> pvsurs = service.selectPvsurByfk(cityid);
        return  pvsurs;
    }

    @RequestMapping("/selectPvsur.do")
    @ResponseBody
    public List<Pvsur> selectPvsur(){
        List<Pvsur> pvsurs = service.selectPvsur();
        return  pvsurs;
    }
}
