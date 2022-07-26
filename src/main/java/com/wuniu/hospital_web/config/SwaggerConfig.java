package com.wuniu.hospital_web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger配置信息
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("换联网医院API文档")
                .description("采用restful风格接口")
                .version("1.0")
                .build();
    }
    @Bean
    public Docket docket(ApiInfo apiInfo) {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage(
                        "com.wuniu.hospital_web.web"))
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
