package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Taxi;
import com.zhihuilvxing.service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Taxi")
public class TaxiController {

    @Autowired
    private TaxiService service;

    @RequestMapping("/selectTaxi.do")
    @ResponseBody
    public List<Taxi> selectTaxi(){
        List<Taxi> list =service.selectTaxi();
        return list;
    }

    @RequestMapping("/selectTaxiByfk.do")
    @ResponseBody
    public List<Taxi> selectTaxiByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Taxi> list = service.selectTaxiByfk(cityid);
        return  list;
    }
}
