package com.ecnu.wisdomfarm.controller;

import com.ecnu.wisdomfarm.service.IenvInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    IenvInfoService envInfoService;

    @RequestMapping("/")
    @ResponseBody
    public String testController()
    {
        return envInfoService.findAllEnv().toString();
    }
}
