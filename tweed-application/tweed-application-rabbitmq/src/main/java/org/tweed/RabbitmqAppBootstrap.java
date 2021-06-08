package org.tweed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author guanyh
 * @date 2021/3/26
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class RabbitmqAppBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqAppBootstrap.class, args);
    }
}
