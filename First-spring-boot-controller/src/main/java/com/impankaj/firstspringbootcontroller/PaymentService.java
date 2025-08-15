package com.impankaj.firstspringbootcontroller;

import org.springframework.stereotype.Component;

public interface PaymentService {
    void processPayment(Double amount);
}
