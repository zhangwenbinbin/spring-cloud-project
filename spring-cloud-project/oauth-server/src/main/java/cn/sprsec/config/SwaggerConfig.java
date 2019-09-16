package cn.sprsec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SpringBoot Swagger 配置类
 * 
 * @author 张文斌
 * @data 2018/9/13
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createApi() {
        return new Docket(DocumentationType.SWAGGER_2).genericModelSubstitutes(DeferredResult.class)
            .useDefaultResponseMessages(false)
            .forCodeGeneration(false)
            .pathMapping("/")
            .select()
            .apis(RequestHandlerSelectors.basePackage("cn.oauth"))
            // .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo());
    }

    /**
     * 接口文档配置信息
     * 
     * @return ApiInfo
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("oauth API Doc")
            .description("oauth 接口文档")
            .version("1.0.0")
            .termsOfServiceUrl("cn.oauth")
            .build();
    }
}
