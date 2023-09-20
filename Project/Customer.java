package Project;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private List<Order> orders;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public String getName(){
        return name;
    }
    public Order getLastOrder() {
        if (orders.size() > 0) {
            return orders.get(orders.size() - 1);
        }
        return null;
    }

    public void viewOrderHistory() {
        for (Order order : orders) {
            System.out.println("Order Date: " + order.getDate() + ", Status: " + order.getStatus() + ", Total: " + order.calcTotal());
        }
    }
}