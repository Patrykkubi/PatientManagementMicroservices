package com.pm.billingservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record BillingRequestDTO(
        @NotNull UUID patientId,
        @NotBlank String name,
        @NotNull @Email String email
) {}