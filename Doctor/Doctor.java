package Doctor;
/**
 * practice polymorphism
 * 
 * @author Mcandrew Okwei
 * @version 3.0 (September 30 2022)
 */


public class Doctor{
    protected static double billableRate = 100.0;
    /**
     * 
     * 
     * @param billablerate
     * @return billableRate
     */
public static double getBill( double billablerate){
        return billableRate;
    }
    /**
     * return the billable rate value
     * 
     * @return billableRate
     */
public  double getBill() {
    return billableRate;
}

}