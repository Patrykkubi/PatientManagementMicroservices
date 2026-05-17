package com.pm.patientservice.dto;

import java.util.UUID;

public class BillingResponseDTO {
    private UUID accountId;
    private String status;

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
