package com.tata.javatests.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
