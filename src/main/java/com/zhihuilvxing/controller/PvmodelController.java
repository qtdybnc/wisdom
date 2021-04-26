package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Pvmodel;
import com.zhihuilvxing.service.PvmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Pvmodel")
public class PvmodelController {

    @Autowired
    private PvmodelService service;

    @RequestMapping("/selectPvmodelByfk.do")
    @ResponseBody
    public List<Pvmodel> selectPvmodelByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Pvmodel> pvmodels =service.selectPvmodelByfk(cityid);
        return  pvmodels;
    }

    @RequestMapping("/selectPvmodel.do")
    @ResponseBody
    public List<Pvmodel> selectPvmodel(){
        List<Pvmodel> pvmodels =service.selectPvmodel();
        return  pvmodels;
    }
}
