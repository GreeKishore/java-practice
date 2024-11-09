package mypractice.lld1.streams.realworldproblems;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {
    private String orderId;
    private String customerId;
    private double orderAmount;
    private LocalDate orderDate;

    public Order(String orderId, String customerId, double orderAmount, LocalDate orderDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderAmount = orderAmount;
        this.orderDate = orderDate;
    }

    public static Map<String, Double> getTotalOrderAmountByCustomer(List<Order> orders) {
        return orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomerId, Collectors.summingDouble(Order::getOrderAmount)));
    }

    public static void main(String[] args) {
        /*
            You are given a list of Order objects, where each Order has an orderId, customerId, orderAmount, and orderDate.
            Write a method that returns a map where the keys are the
            customer IDs and the values are the total order amounts for each customer. Use Java Streams to solve this problem.
        */
        List<Order> orders = List.of(
                new Order("O1", "C1", 150.0, LocalDate.of(2023, 6, 15)),
                new Order("O2", "C2", 200.0, LocalDate.of(2023, 6, 16)),
                new Order("O3", "C1", 100.0, LocalDate.of(2023, 6, 17)),
                new Order("O4", "C3", 250.0, LocalDate.of(2023, 6, 18)),
                new Order("O5", "C2", 300.0, LocalDate.of(2023, 6, 19))
        );

        Map<String, Double> totalOrderAmounts = getTotalOrderAmountByCustomer(orders);
        totalOrderAmounts.forEach((customerId, totalAmount) ->
                System.out.println("Customer ID: " + customerId + ", Total Order Amount: " + totalAmount));
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}