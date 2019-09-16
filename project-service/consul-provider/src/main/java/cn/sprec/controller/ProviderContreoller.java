package cn.sprec.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 张文斌
 * @Data: 2019/7/31 17
 * @Description:
 */
@RestController
@RefreshScope
public class ProviderContreoller {

    @Value("${spring.application.name}")
    private String servicename;

    @GetMapping("/hi")
    public String hi(){
        return "hi: "+servicename;
    }
}
