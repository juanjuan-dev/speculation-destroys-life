package com.juanjuan.service.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication // 具备当前类所在包扫描功能
@EnableDiscoveryClient
@EnableFeignClients
@RestController
//@EnableBinding({Source.class, PersonSource.class, PersonSink.class})
public class EchoServiceClientBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(EchoServiceClientBootstrap.class, args);
    }
}
