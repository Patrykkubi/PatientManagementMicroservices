package com.pm.patientservice.exception;

public class BillingServiceUnavailableException extends RuntimeException {
    public BillingServiceUnavailableException(String message) {
        super(message);
    }
}
