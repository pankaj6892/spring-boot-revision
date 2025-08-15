package com.impankaj.firstspringbootcontroller;

public class OrderService {

    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService) {
//     this.paymentService = paymentService;
//    }

    public void placeOrder() {
       paymentService.processPayment(50.0);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }
}
