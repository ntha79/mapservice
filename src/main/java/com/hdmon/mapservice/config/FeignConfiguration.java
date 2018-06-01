package com.hdmon.mapservice.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.hdmon.mapservice")
public class FeignConfiguration {

}
