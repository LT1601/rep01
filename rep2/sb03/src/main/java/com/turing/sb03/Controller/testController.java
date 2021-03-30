package com.turing.sb03.Controller;

import com.turing.sb03.Sb03Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

    //获取日志对象
    private Logger log= LoggerFactory.getLogger(Sb03Application.class);

    @GetMapping("/test01")
    @ResponseBody
    public String test01(){
        log.info("Hello,程序启动了啊");
        return "程序启动了";
    }


}
