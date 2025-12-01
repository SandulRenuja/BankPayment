package com.bank.bank;

public class Payment {
    protected double amount;
    protected String currency;
    protected String status;

    public Payment(double amount, String currency){
        this.amount = amount;
        this.currency = currency;
        this.status= "Pending";
    }

    public void processPayment(){
        System.out.println("Processing generic payment of" + this.amount + "" + this.currency + "" );
    }

    public void generateReceipt(){
        System.out.println("--- Receipt ---");
        System.out.println("Payment Amount: " + this.amount + " " + this.currency);
        System.out.println("Payment Status: " + this.status);
    }

    public void markAsCompleted(){
        this.status = "COMPLETED";
        System.out.println("Payment status updated to:" + this.status);
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
