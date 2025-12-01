package com.bank.bank;

public class BankTransfer  extends Payment{

    private String bankName;
    private String accountNumber;
    private String referenceCode;

    public BankTransfer(double amount, String currency, String bankName, String accountNumber, String referenceCode) {
        super(amount, currency);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.referenceCode = referenceCode;
    }


    @Override
    public void processPayment(){
        System.out.println("Initiating bank transfer of " + getAmount() + " " + getCurrency() + " to " + this.bankName);
        System.out.println("Using account " + this.accountNumber + " with reference " + this.referenceCode);
        markAsCompleted();
    }

    @Override
    public void generateReceipt(){
        System.out.println("Payment Method: Bank Transfer");
        System.out.println("Bank Name: " + this.bankName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Reference Code: " + this.referenceCode);
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getReferenceCode() {
        return referenceCode;
    }


}
