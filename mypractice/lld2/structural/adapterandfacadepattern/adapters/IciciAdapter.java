package mypractice.lld2.structural.adapterandfacadepattern.adapters;

import mypractice.lld2.structural.adapterandfacadepattern.BankAccount;
import mypractice.lld2.structural.adapterandfacadepattern.thirdpartyAPI.IciciBankApi.IciciBankInterface;
import mypractice.lld2.structural.adapterandfacadepattern.thirdpartyAPI.YesBankApi.YesBankInterface;

public class IciciAdapter implements BankAPI_MainInterface{
    private final IciciBankInterface iciciBankInterface;

    public IciciAdapter(IciciBankInterface iciciBankInterface) {
        this.iciciBankInterface = iciciBankInterface;
    }
    @Override
    public void addBankAccount(BankAccount bankAccount) {

    }

    @Override
    public double checkBalance(BankAccount account) {
        return 0;
    }
}