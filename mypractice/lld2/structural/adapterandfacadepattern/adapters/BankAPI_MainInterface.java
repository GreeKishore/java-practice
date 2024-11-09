package mypractice.lld2.structural.adapterandfacadepattern.adapters;

import mypractice.lld2.structural.adapterandfacadepattern.BankAccount;

public interface BankAPI_MainInterface {
    void addBankAccount(BankAccount bankAccount);

    double checkBalance(BankAccount account);
}