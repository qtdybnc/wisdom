package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Baufe;
import com.zhihuilvxing.domain.Ldt;
import com.zhihuilvxing.service.BaufeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Baufe")
public class BaufeController {
    @Autowired
    private BaufeService service;

    @RequestMapping("/selectBaufe.do")
    @ResponseBody
    public List<Baufe> selectBaufe(){
        List<Baufe> list = service.selectBaufe();
        return list;
    }


    @RequestMapping("/selectBaufeByf")
    @ResponseBody
    public List<Baufe> selectBaufeByf(String modeid){
        List<Baufe> baufes = service.selectBaufeByf(Integer.valueOf(modeid));
        return  baufes;
    }

    @RequestMapping("/selectBaufeByfk.do")
    @ResponseBody
    public List<Baufe> selectBaufeByfk(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer cityid = (Integer) session.getAttribute("cityid");
        List<Baufe> list = service.selectBaufeByfk(cityid);
        return list;
    }
}
