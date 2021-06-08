package org.tweed.rpc;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author guanyh
 * @date 2021/3/26
 */
@FeignClient("service-provider")
public class UserFeignApi {
}
