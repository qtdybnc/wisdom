package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Taxisur;
import com.zhihuilvxing.service.TaxisurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Taxisur")
public class TaxisurController {

    @Autowired
    private TaxisurService service;

    @RequestMapping("/selectTaxisur.do")
    @ResponseBody
    public List<Taxisur> selectTaxisur(){
        List<Taxisur> list = service.selectTaxisur();
        return  list;
    }

    @RequestMapping("/selectTaxisurByfk.do")
    @ResponseBody
    public List<Taxisur> selectTaxisurByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Taxisur> list = service.selectTaxisurByfk(cityid);
        return  list;
    }
}
