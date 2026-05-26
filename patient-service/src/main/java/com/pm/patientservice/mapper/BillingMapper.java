package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.BillingRequestDTO;
import com.pm.patientservice.model.Patient;

public class BillingMapper {
    public static BillingRequestDTO toBillingRequest(Patient patient) {
        BillingRequestDTO billingRequestDTO = new BillingRequestDTO();
        billingRequestDTO.setPatientId(patient.getId());
        billingRequestDTO.setPatientName(patient.getName());
        billingRequestDTO.setPatientEmail(patient.getEmail());

        return billingRequestDTO;
    }
}
