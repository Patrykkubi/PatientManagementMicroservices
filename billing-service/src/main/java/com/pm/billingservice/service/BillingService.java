package com.pm.billingservice.service;

import com.pm.billingservice.dto.BillingRequestDTO;
import com.pm.billingservice.dto.BillingResponseDTO;
import com.pm.billingservice.model.BillingAccount;
import com.pm.billingservice.repository.BillingRepository;
import org.springframework.stereotype.Service;

@Service
public class BillingService {
    private final BillingRepository billingRepository;

    public BillingService(BillingRepository billingRepository) {
        this.billingRepository = billingRepository;
    }

    public BillingResponseDTO createBillingAccount(BillingRequestDTO billingRequestDTO) {
        BillingAccount billingAccount = new BillingAccount();
        billingAccount.setPatientId(billingRequestDTO.patientId());
        billingAccount.setName(billingAccount.getName());
        billingAccount.setEmail(billingAccount.getEmail());

        billingRepository.save(billingAccount);

        return new BillingResponseDTO(
                billingAccount.getId(),
                billingAccount.getPatientId(),
                "CREATED"
        );
    }

    // demo rest connected microservice, so only has createAccount endpoint
}
