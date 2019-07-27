package com.li.springcloud.tgetway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy   //启用zuul路由服务
public class TgetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TgetwayApplication.class, args);
    }

}
