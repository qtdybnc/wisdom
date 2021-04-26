package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Rbusmodel;
import com.zhihuilvxing.service.RbusmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Rbusmodel")
public class RbusmodelController {

    @Autowired
    private RbusmodelService service;

    @RequestMapping("/selectRbusmodelByfk.do")
    @ResponseBody
    public List<Rbusmodel> selectRbusmodelByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Rbusmodel> rbusmodels =service.selectRbusmodelByfk(cityid);
        return  rbusmodels;
    }

    @RequestMapping("/selectRbusmodel.do")
    @ResponseBody
    public List<Rbusmodel> selectRbusmodel(){
        List<Rbusmodel> rbusmodels =service.selectRbusmodel();
        return  rbusmodels;
    }
}
