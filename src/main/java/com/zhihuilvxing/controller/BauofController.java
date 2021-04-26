package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Bauof;
import com.zhihuilvxing.domain.Ldt;
import com.zhihuilvxing.service.BauofService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Bauof")
public class BauofController {
    @Autowired
    private BauofService service;

    @RequestMapping("/selectBauof.do")
    @ResponseBody
    public List<Bauof> selectBauof(){
        List<Bauof> list = service.selectBauof();
        return  list;
    }

    @RequestMapping("/selectBauofByfk.do")
    @ResponseBody
    public List<Bauof> selectBauofByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Bauof> list = service.selectBauofByfk(cityid);
        return  list;
    }
}
