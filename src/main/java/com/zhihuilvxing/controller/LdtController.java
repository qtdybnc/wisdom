package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Ldt;
import com.zhihuilvxing.service.LdtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Ldt")
public class LdtController {
    @Autowired
    private LdtService service;

    @RequestMapping("/selectLdt.do")
    @ResponseBody
    public List<Ldt> selectLdt(){
        List<Ldt> ldts = service.selectLdt();
        return ldts;
    }

    @RequestMapping("/selectLdtByfk.do")
    @ResponseBody
    public List<Ldt> selectLdtByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Ldt> ldts = service.selectLdtByfk(cityid);
        return  ldts;
    }
}
