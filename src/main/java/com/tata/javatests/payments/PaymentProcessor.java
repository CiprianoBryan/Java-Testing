package com.tata.javatests.payments;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount) {
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        return response.getStatus() == PaymentStatus.OK;
    }
}
