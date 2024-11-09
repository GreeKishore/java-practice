package mypractice.lld1.streams.realworldproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Transactions {
    private int id;
    private double amount;
    private String category;

    public Transactions(int id, double amount, String category) {
        this.id = id;
        this.amount = amount;
        this.category = category;
    }

    /*
        You are given a list of transactions, where each transaction consists of an ID, amount, and a category
        (e.g., "groceries", "electronics", etc.). Your task is to:

        Calculate the total amount spent on each category.
        Return the results as a Map<String, Double>, where the key is the category, and the value is the total amount spent on that category.

        Transaction class is created separately

        Sample output
            {
            "groceries": 150.0,
            "electronics": 350.0,
            "clothing": 300.0
            }
        */
    public static void main(String[] args) {
        List<Transactions> transactions = Arrays.asList(
                new Transactions(1, 100.0, "groceries"),
                new Transactions(2, 200.0, "electronics"),
                new Transactions(3, 50.0, "groceries"),
                new Transactions(4, 300.0, "clothing"),
                new Transactions(5, 150.0, "electronics")
        );

        Map<String, Double> result = transactions.stream().collect(Collectors
                .groupingBy(Transactions::getCategory, Collectors.summingDouble(Transactions::getAmount)));
        System.out.println(result);
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }
}