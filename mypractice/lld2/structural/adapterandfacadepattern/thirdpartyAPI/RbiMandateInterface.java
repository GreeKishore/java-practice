package mypractice.lld2.structural.adapterandfacadepattern.thirdpartyAPI;

import mypractice.lld2.structural.adapterandfacadepattern.Balance;

public interface RbiMandateInterface {
    String addBankAccount(String accountId, String name);

    Balance checkBalance(String accountId);
}