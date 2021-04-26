package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Ldtsur2;
import com.zhihuilvxing.service.Ldtsur2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Ldtsur2")
public class Ldtsur2Controller {
    @Autowired
    private Ldtsur2Service service;

    @RequestMapping("/selectLdtsur2.do")
    @ResponseBody
    public List<Ldtsur2> selectLdtsur2(){
        List<Ldtsur2> ldtsur2s = service.selectLdtsur2();
        return  ldtsur2s;
    }

    @RequestMapping("/selectLdtsur2Byfk.do")
    @ResponseBody
    public List<Ldtsur2> selectLdtsur2Byfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Ldtsur2> ldtsur2s = service.selectLdtsur2Byfk(cityid);
        return  ldtsur2s;
    }
}
