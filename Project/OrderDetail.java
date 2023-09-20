package Project;

public class OrderDetail {
    
    private int quantity;
    private Item item;

    public OrderDetail(Item item,int quantity){
        this.item = item;
        this.quantity=quantity;
    }

    public double calcSubTotal(){
        return item.getPriceForQuantity(quantity);

    }

    public double calcWeight(){
        return quantity * item.getWeight();
    }
}
