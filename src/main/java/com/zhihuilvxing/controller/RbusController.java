package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Rbus;
import com.zhihuilvxing.service.RbusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Rbus")
public class RbusController {
    @Autowired
    private RbusService service;

    @RequestMapping("/selectRbusByfk.do")
    @ResponseBody
    public List<Rbus> selectRbusByfk(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Rbus> rbuses = service.selectRbusByfk(cityid);
        return  rbuses;
    }

    @RequestMapping("/selectRbus.do")
    @ResponseBody
    public List<Rbus> selectRbus() {
        List<Rbus> rbuses = service.selectRbus();
        return  rbuses;
    }

    @RequestMapping("/addRbus.do")
    public String addRbus(Rbus rbus){
        int result = service.addRbus(rbus);
        if(result >0){
            return "check";
        }
        return "checkNo";
    }
}
