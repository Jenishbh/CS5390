package Project;

public class Credit extends Payment {
    private int number;
    private String type;
    private String expDate;

    @Override
    public boolean authorized(){
        return true; // assume transection completed
    }
    
    
    
}
