package Project;

public class main {
    public static void main(String[] args) {
        // Sample items
        Item book = new Item("Book", 0.5, 20);
        Item laptop = new Item("Laptop", 2.5, 1200);

        // Order details
        OrderDetail orderDetail1 = new OrderDetail(book, 2);
        OrderDetail orderDetail2 = new OrderDetail(laptop, 1);

        // Order
        Order order = new Order("2023-09-18", "Processing");
        order.addOrderDetail(orderDetail1);
        order.addOrderDetail(orderDetail2);

        // Payment
        Credit creditPayment = new Credit();
        creditPayment.amount = order.calcTotal();
        order.setPayment(creditPayment);

        // Customer placing an order
        Customer john = new Customer("John Doe", "123 Elm Street");
        john.placeOrder(order);

        if (order.processPayment()) {
            System.out.println("Payment authorized for customer " + john.getName() + "! Total amount: $" + order.calcTotal());
        } else {
            System.out.println("Payment not authorized.");
        }

        // Viewing order history for John
        john.viewOrderHistory();
    }
}