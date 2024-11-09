package mypractice.lld2.structural.adapterandfacadepattern.adapters;

import mypractice.lld2.structural.adapterandfacadepattern.Balance;
import mypractice.lld2.structural.adapterandfacadepattern.BankAccount;
import mypractice.lld2.structural.adapterandfacadepattern.thirdpartyAPI.YesBankApi.YesBankInterface;
import mypractice.lld2.structural.adapterandfacadepattern.thirdpartyAPI.YesBankApi.YesbankInterfaceImpl;

public class YesBankAdapter implements BankAPI_MainInterface{
    private final YesBankInterface yesBankInterface;

    public YesBankAdapter(YesBankInterface yesBankInterface) {
        this.yesBankInterface = yesBankInterface;
    }

    @Override
    public void addBankAccount(BankAccount bankAccount) {
        String accountid = yesBankInterface.addBankAccount(bankAccount.getAccountNumber(),bankAccount.getAccountHolderName());
        System.out.println("Added bank account successfully");
    }

    @Override
    public double checkBalance(BankAccount account) {
        Balance balance = yesBankInterface.checkBalance(account.getAccountNumber());
        return balance.getAmount();
    }
}