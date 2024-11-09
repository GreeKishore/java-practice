package mypractice.lld2.structural.adapterandfacadepattern;

import mypractice.lld2.structural.adapterandfacadepattern.adapters.BankAPI_MainInterface;

public class Phonepe {
    private final BankAPI_MainInterface bankAPIMainInterface;

    public Phonepe(BankAPI_MainInterface bankAPIMainInterface) {
        this.bankAPIMainInterface = bankAPIMainInterface;
    }

    double performBankOperation() {
        BankAccount bankAccount = new BankAccount("9876543213123", "Vishal");
        bankAPIMainInterface.addBankAccount(bankAccount);
        double balance = bankAPIMainInterface.checkBalance(bankAccount);
        System.out.println("Account balance is - " + balance);
        return balance;
    }

}