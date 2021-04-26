package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Baumil;
import com.zhihuilvxing.service.BaumilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Baumil")
public class BaumilController {

    @Autowired
    private BaumilService service;

    @RequestMapping("/selectBaumil.do")
    @ResponseBody
    public List<Baumil> selectBaumil(){
        List<Baumil> list = service.selectBaumil();
        return  list;
    }

    @RequestMapping("/selectBaumilByf.do")
    @ResponseBody
    public  List<Baumil> seleselectBaumilByf(String modeid){

        List<Baumil> baumils = service.selectBaumilByf(Integer.valueOf(modeid));
        return baumils;
    }

    @RequestMapping("/selectBaumilByfk.do")
    @ResponseBody
    public List<Baumil> selectBaumilByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Baumil> list = service.selectBaumilByfk(cityid);
        return list;
    }
}
