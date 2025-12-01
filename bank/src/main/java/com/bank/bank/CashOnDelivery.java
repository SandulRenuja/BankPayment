package com.bank.bank;

public class CashOnDelivery extends Payment{

    private String deliveryAddress;

    public CashOnDelivery(double amount, String currency, String deliveryAddress) {
        super(amount, currency);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void processPayment() {
        System.out.println("Cash will be collected at delivery address: " + this.deliveryAddress);
    }

    @Override
    public void generateReceipt() {
        System.out.println("--- Receipt ---");
        System.out.println("Payment Method: Cash on Delivery");
        System.out.println("Delivery Address: " + this.deliveryAddress);
        System.out.println("Payment Amount: " + this.amount + " " + this.currency);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}