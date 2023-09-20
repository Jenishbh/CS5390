package Project;

public class Cash extends Payment {
    private int cashTenders;

    @Override
    public boolean authorized(){
        return true;
    }

}
