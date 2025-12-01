package com.bank.bank;

public class CreditCardPayment extends CardPayment {

    private double creditLimit;

    public CreditCardPayment(double amount, String currency, String cardNumber, String cardHolderName, String expiryDate, double creditLimit) {
        super(amount, currency, cardNumber, cardHolderName, expiryDate);
        this.creditLimit = creditLimit;
    }

    public void processPayment(){
        System.out.println("Charging credit card with limit" +  this.creditLimit + "for amount" + getAmount());

        markAsCompleted();
        applyInterest();
    }
    @Override
    public void generateReceipt() {
        super.generateReceipt(); // Gets common CardPayment details
        System.out.println("Card Type: Credit Card");
        System.out.println("Credit Limit: " + this.creditLimit + " " + getCurrency());
    }

    public void applyInterest(){
        System.out.println("Applying interest if payment is not settled by due date");
    }



    public double getCreditLimit() {
        return creditLimit;
    }
}
