package com.turing.sb03.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class stuController {
    @Value("${app.name}")
   private String name;

    @GetMapping("/getName")
    public String getName(){
        return name;
    }
}
