package com.pm.billingservice.dto;

import java.util.UUID;

public record BillingResponseDTO(
        UUID accountId,
        UUID patientId,
        String status
) {}
