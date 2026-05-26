package com.pm.patientservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient billingWebClient(@Value("${billing.service.url}") String billingUrl) {

        return WebClient.builder()
                .baseUrl(billingUrl)
                .build();
    }
}