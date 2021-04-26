package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Rbussur2;
import com.zhihuilvxing.service.Rbussur2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Rbussur2")
public class Rbussur2Controller {
    @Autowired
    private Rbussur2Service rbussur2Service;

    @RequestMapping("/selectRbussur2Byfk.do")
    @ResponseBody
    public List<Rbussur2> selectRbussurByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Rbussur2> rbussurs = rbussur2Service.selectRbussur2Byfk(cityid);
        return  rbussurs;
    }

    @RequestMapping("/selectRbussur2.do")
    @ResponseBody
    public List<Rbussur2> selectRbussur2(String cityid){
        List<Rbussur2> rbussurs = rbussur2Service.selectRbussur2();
        return  rbussurs;
    }
}
