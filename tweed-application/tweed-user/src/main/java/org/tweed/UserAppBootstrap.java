package org.tweed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author guanyh
 * @date 2021/3/26
 */
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class UserAppBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UserAppBootstrap.class, args);
    }
}
