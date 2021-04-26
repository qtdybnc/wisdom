package com.zhihuilvxing.controller;


import com.zhihuilvxing.domain.Ldtsur;
import com.zhihuilvxing.service.LdtsurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Ldtsur")
public class LdtsurController {
    @Autowired
    private LdtsurService service;

    @RequestMapping("/selectLdtsur.do")
    @ResponseBody
    public List<Ldtsur> selectLdtsur(){
        List<Ldtsur> ldtsurs = service.selectLdtsur();
        return  ldtsurs;
    }

    @RequestMapping("/selectLdtsurByfk.do")
    @ResponseBody
    public List<Ldtsur> selectLdtsurByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Ldtsur> ldtsurs = service.selectLdtsurByfk(cityid);
        return  ldtsurs;
    }
}
