package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Bauev;
import com.zhihuilvxing.service.BauevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Bauev")
public class BauevController {
    @Autowired
    private BauevService service;

    @RequestMapping("/selectBauev.do")
    @ResponseBody
    public List<Bauev> selectBauev(){
        List<Bauev> list = service.selectBauev();
        return list;
    }

    @RequestMapping("/selectBauevByfk.do")
    @ResponseBody
    public List<Bauev> selectBauevByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Bauev> list = service.selectBauevByfk(cityid);
        return  list;
    }
}
