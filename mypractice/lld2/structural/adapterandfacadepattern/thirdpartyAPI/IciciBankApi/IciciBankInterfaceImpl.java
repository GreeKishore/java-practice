package mypractice.lld2.structural.adapterandfacadepattern.thirdpartyAPI.IciciBankApi;

import mypractice.lld2.structural.adapterandfacadepattern.Balance;

public class IciciBankInterfaceImpl implements IciciBankInterface {
    @Override
    public String addBankAccount(String accountId, String name) {
        return null;
    }

    @Override
    public Balance checkBalance(String accountId) {
        return null;
    }
}