package cn.sprec.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: 张文斌
 * @Data: 2019/7/31 17
 * @Description:
 */
@FeignClient(value = "consul-provider")
public interface ProviderClient {

    @GetMapping("/hi")
    String hi();
}
