package com.pm.patientservice.client;

import com.pm.patientservice.dto.BillingRequestDTO;
import com.pm.patientservice.dto.BillingResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class BillingClient {

    private final WebClient billingWebClient;

    public BillingClient(WebClient billingWebClient) {
        this.billingWebClient = billingWebClient;
    }

    public BillingResponseDTO createBillingAccount(BillingRequestDTO request) {

        return billingWebClient.post()
                .uri("/billing/accounts")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(BillingResponseDTO.class)
                .block();
    }
}