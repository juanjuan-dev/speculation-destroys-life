package org.tweed;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author guanyh
 * @date 2021/6/8
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableCircuitBreaker
@EnableZuulProxy
//@EnableTrace(isEnabled = true)
public class GateWayApp {
    public static void main(String[] args) {
        log.info(">>> 启动 GatewayApp 开始<<<");
        SpringApplication.run(GateWayApp.class, args);
        log.info(">>> 启动 GatewayApp 结束 <<<");
    }
}
