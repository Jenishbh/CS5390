package Project;

abstract class Payment {
    
    protected double amount;

    public abstract boolean authorized();
}
