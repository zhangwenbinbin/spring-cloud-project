package cn.sprec.controller;

import cn.sprec.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 张文斌
 * @Data: 2019/7/31 17
 * @Description:
 */
@RestController
public class ConsumerController {

    @Autowired
    private ProviderClient providerClient;

    @Value("${spring.application.name}")
    private String servicename;

    @GetMapping("/hello")
    public String hello(){
        return "hi:"+servicename;
    }

    @GetMapping("/hi")
    public String hiFeign(){
        return providerClient.hi();
    }
}
