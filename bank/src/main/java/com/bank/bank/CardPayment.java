package com.bank.bank;

public class CardPayment extends Payment{
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;


    public CardPayment(double amount, String currency,String cardNumber , String cardHolderName, String expiryDate) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
        System.out.println("Authorizing card payment for"+ this.cardHolderName+ " for amount " + getAmount() + " " + getCurrency());
    }



    public void validateCard(){
        System.out.println("Validating card number format for card ending in:" + cardNumber);
    }
}
