package com.pm.patientservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

public class BillingRequestDTO {

    @NotNull
    private UUID patientId;

    @NotNull
    private String patientName;

    @NotNull
    @Email
    private String patientEmail;

    public BillingRequestDTO() {}

    public BillingRequestDTO(UUID id, String name, String email) {
    }

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }
}
