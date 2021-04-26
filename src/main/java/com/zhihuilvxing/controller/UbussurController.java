package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Ubussur;
import com.zhihuilvxing.service.UbussurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Ubussur")
public class UbussurController {
    @Autowired
    private UbussurService service;

    @RequestMapping("/selectUbussur.do")
    @ResponseBody
    public List<Ubussur> selectUbussur(){
        List<Ubussur> list = service.selectUbussur();
        return  list;
    }

    @RequestMapping("/selectUbussurByfk.do")
    @ResponseBody
    public List<Ubussur> selectUbussurByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Ubussur> list =service.selectUbussurByfk(cityid);
        return  list;
    }
}
