package com.pm.patientservice.client;

import com.pm.patientservice.dto.BillingRequestDTO;
import com.pm.patientservice.dto.BillingResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Billing-service", url = "${Billing.service.url}")
public interface BillingClient {

    @PostMapping("/billing/accounts")
    BillingResponseDTO createBillingAccount(@RequestBody BillingRequestDTO billingRequestDTO);
}
