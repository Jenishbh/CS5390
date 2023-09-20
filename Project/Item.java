package Project;

public class Item {
    private String description;
    private double weight;
    private double price;

    public Item(String desciption, double weight, double price){
        this.description = desciption;
        this.weight = weight;
        this.price = price;
    }

    public double getPriceForQuantity(int quantity){
        return price * quantity;
    }
    public double getWeight(){
        return weight;
    }
    
}
