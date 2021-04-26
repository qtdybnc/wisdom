package com.zhihuilvxing.controller;

import com.zhihuilvxing.domain.Mode;
import com.zhihuilvxing.service.ModeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/Mode")
public class ModeController {
    @Autowired
    private ModeService service;

    @RequestMapping("/selectMode")
    @ResponseBody
    public List<Mode> selectmode(){
        List<Mode> modes = service.selectMode();
        return modes;
    }

}
