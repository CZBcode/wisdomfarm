package com.ecnu.wisdomfarm.controller;

import com.ecnu.wisdomfarm.Redis.RedisUtils;
import com.ecnu.wisdomfarm.entity.envInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class RedisTestController {


    @Autowired
    private RedisUtils redisUtil;

    @RequestMapping("/hello")
    @ResponseBody
    public String testController()
    {
        envInfo envinfo=new envInfo();
        envinfo.setTimeStamp(new Date(System.currentTimeMillis()).toString());
        envinfo.setCarbonDioxide(0.23);
        envinfo.setHumidity(56);
        envinfo.setIlluminance(23.2);
        envinfo.setTemperature(25.0);

        redisUtil.set("environment",envinfo);
        System.out.println(redisUtil.get("environment"));

        return redisUtil.get("environment").toString();
    }

}
