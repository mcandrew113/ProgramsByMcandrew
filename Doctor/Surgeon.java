package Doctor;

public class Surgeon extends Doctor{

    @Override
    public double getBill(){
        return billableRate * 2.5;
    }
}
