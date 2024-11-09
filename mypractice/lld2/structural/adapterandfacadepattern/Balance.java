package mypractice.lld2.structural.adapterandfacadepattern;

public class Balance {
    private double amount;

    public Balance(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}