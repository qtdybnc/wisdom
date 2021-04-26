package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Hdts;
import com.zhihuilvxing.service.HdtsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Hdts")
public class HdtsController {

    @Autowired
   private HdtsService service;

    @RequestMapping("/selectHdtsByfk.do")
    @ResponseBody
    public List<Hdts> selectHdtsByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Hdts> Hdtss = service.selectHdtsByfk(cityid);
        return Hdtss;
    }

    @RequestMapping("/selectHdts.do")
    @ResponseBody
    public List<Hdts> selectHdt(){
        List<Hdts> Hdtss = service.selectHdts();
        return Hdtss;
    }
}
