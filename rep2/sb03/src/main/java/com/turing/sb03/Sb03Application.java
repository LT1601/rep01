package com.turing.sb03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:myconfig.properties")
public class Sb03Application {

   static Logger log= LoggerFactory.getLogger(Sb03Application.class);


    public static void main(String[] args) {
          log.info("程序启动了。。。");
        SpringApplication.run(Sb03Application.class, args);
    }

}
