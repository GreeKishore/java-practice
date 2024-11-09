package mypractice.lld2.structural.adapterandfacadepattern;

import mypractice.lld2.structural.adapterandfacadepattern.adapters.BankAPI_MainInterface;
import mypractice.lld2.structural.adapterandfacadepattern.adapters.IciciAdapter;
import mypractice.lld2.structural.adapterandfacadepattern.adapters.YesBankAdapter;
import mypractice.lld2.structural.adapterandfacadepattern.thirdpartyAPI.IciciBankApi.IciciBankInterface;
import mypractice.lld2.structural.adapterandfacadepattern.thirdpartyAPI.IciciBankApi.IciciBankInterfaceImpl;
import mypractice.lld2.structural.adapterandfacadepattern.thirdpartyAPI.YesBankApi.YesBankInterface;
import mypractice.lld2.structural.adapterandfacadepattern.thirdpartyAPI.YesBankApi.YesbankInterfaceImpl;

public class Client {
    public static void main(String[] args) {
//        YesBankInterface yesBankInterface = new YesbankInterfaceImpl();
        IciciBankInterface iciciBankInterface = new IciciBankInterfaceImpl();
        BankAPI_MainInterface bankAPIMainInterface = new IciciAdapter(iciciBankInterface);
        Phonepe phonepe = new Phonepe(bankAPIMainInterface);
        double amount = phonepe.performBankOperation();
        System.out.println("Returned amount is - " + amount);
    }
}