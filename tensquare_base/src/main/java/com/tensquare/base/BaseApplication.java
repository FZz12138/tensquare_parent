package com.tensquare.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/**
 * @ClassName BaseApplication
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/12 0012 16:28
 * @Version 1.0
 **/
@SpringBootApplication
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class,args);
    }
    @Bean
    public IdWorker idWorker(){
        return  new IdWorker(1,1);
    }
}
