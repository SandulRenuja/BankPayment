package com.bank.bank;

public class DebitCardPayment extends CardPayment {
    private double availableBalance;

    public DebitCardPayment(double amount, String currency, String cardNumber, String cardHolderName, String expiryDate, double availableBalance) {
        super(amount, currency, cardNumber, cardHolderName, expiryDate);
        this.availableBalance =availableBalance;
    }

    @Override
    public void processPayment() {
        System.out.println("Debiting from account balance " + this.availableBalance + " for amount " + getAmount());
        checkSufficientBalance();
        markAsCompleted();
    }

    @Override
    public void generateReceipt() {
        super.generateReceipt(); // Gets common CardPayment details
        System.out.println("Card Type: Debit Card");
        System.out.println("Available Balance: " + this.availableBalance + " " + getCurrency());
    }

    public void checkSufficientBalance(){
        if (getAmount() > availableBalance) {
            System.out.println("FAILED: Insufficient balance!");
            this.setStatus("FAILED");
        } else {
            System.out.println("SUCCESS: Balance covers amount.");
        }
    }
}
