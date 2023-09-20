package Project;

import java.util.ArrayList;
import java.util.List;

public class Order{

    private String date;
    private String status;
    private List<OrderDetail> orderDetails;
    private Payment payment;
    
    public Order(String date, String status){
        this.date = date;
        this.status= status;
        this.orderDetails = new ArrayList<>();
    }
    public void addOrderDetail(OrderDetail orderDetail) {
        orderDetails.add(orderDetail);
    }
    public double calcSubTotal() {
        double subTotal = 0;
        for (OrderDetail detail : orderDetails) {
            subTotal += detail.calcSubTotal();
        }
        return subTotal;
    }
    
    public double calcTax(){
        // tax is flat 10%
        return calcSubTotal()* 0.10;
    };

    public String getDate(){
        return date;
    }
    
    public String getStatus(){
        return status;
    }

    public double calcTotal(){
        return calcTax() + calcSubTotal();
    };

    public double calcTotalWeight(){

        double totalWeight = 0;
        for (OrderDetail detail : orderDetails){
             totalWeight += detail.calcWeight();
        }
        return totalWeight;
    };

    public void setPayment(Payment payment){
        this.payment = payment;
    }
    public boolean processPayment(){
        return payment.authorized();
    }

}