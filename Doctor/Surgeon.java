package Doctor;
/**
 * practice polymorphism
 * 
 * @author Mcandrew Okwei
 * @version 3.0 (September 30 2022)
 */
public class Surgeon extends Doctor{

    @Override
    public double getBill(){
        return billableRate * 2.5;
    }
}
