package Project;

public class Check extends Payment {
    
    private String name;
    private int bankID;

    @Override
    public boolean authorized(){
        return true;
    }
}
