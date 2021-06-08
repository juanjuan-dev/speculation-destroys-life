package org.tweed.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * OpenFeign的接口
 */
@FeignClient("service-provider")
public interface EchoServiceClient {

    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable String message);
}
