package com.bank.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BankApplication {
	public static void main(String[] args) {
        CashOnDelivery cod = new CashOnDelivery(50.00,"USD","Main st, Kandy");
        BankTransfer transfer = new BankTransfer(150.00, "LKR", "SampathBank", "1234567890", "SAMPATH001");
        CreditCardPayment creditCard = new CreditCardPayment(1000.75, "LKR", "4568 4285 48652", "Sandul", "12/26", 5000.00);
        DebitCardPayment debitCard = new DebitCardPayment(100.20, "USD", "9876 5988 9856 5432", "Sandul", "05/25", 80.00);

        List<Payment> payments = new ArrayList<>();
        payments.add(cod);
        payments.add(transfer);
        payments.add(creditCard);
        payments.add(debitCard);

        cod.processPayment();
        cod.generateReceipt();

        transfer.processPayment();
        transfer.generateReceipt();

        creditCard.processPayment();
        creditCard.generateReceipt();

        debitCard.processPayment();
        debitCard.generateReceipt();





	}

}
