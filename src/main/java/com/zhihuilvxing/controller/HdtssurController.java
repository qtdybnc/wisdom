package com.zhihuilvxing.controller;


import com.zhihuilvxing.domain.Hdtssur;
import com.zhihuilvxing.service.HdtssurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Hdtssur")
public class HdtssurController {

    @Autowired
   private HdtssurService service;

    @RequestMapping("/selectHdtssurByfk.do")
    @ResponseBody
    public List<Hdtssur> selectHdtssurByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Hdtssur> Hdtssurs = service.selectHdtssurByfk(cityid);
        return Hdtssurs;
    }

    @RequestMapping("/selectHdtssur.do")
    @ResponseBody
    public List<Hdtssur> selectHdtssur(){
        List<Hdtssur> Hdtssurs = service.selectHdtssur();
        return Hdtssurs;
    }
}
