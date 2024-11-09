package mypractice.lld2.structural.adapterandfacadepattern.thirdpartyAPI.YesBankApi;

import mypractice.lld2.structural.adapterandfacadepattern.Balance;

public class YesbankInterfaceImpl implements YesBankInterface{
    @Override
    public String addBankAccount(String accountId, String name) {
        System.out.println("Adding bank account via Yes Bank API");
        return accountId;
    }

    @Override
    public Balance checkBalance(String accountId) {
        return new Balance(100.39);
    }
}