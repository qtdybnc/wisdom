package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Rbussur;
import com.zhihuilvxing.service.RbussurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Rbussur")
public class RbussurController {
    @Autowired
    private RbussurService service;

    @RequestMapping("/selectRbussurByfk.do")
    @ResponseBody
    public List<Rbussur> selectRbussurByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Rbussur> rbussurs = service.selectRbussurByfk(cityid);
        return  rbussurs;
    }

    @RequestMapping("/selectRbussur.do")
    @ResponseBody
    public List<Rbussur> selectRbussur(){
        List<Rbussur> rbussurs = service.selectRbussur();
        return  rbussurs;
    }
}
