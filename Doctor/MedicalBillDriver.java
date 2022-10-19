package Doctor;
/**
 * practice polymorphism
 * 
 * @author Mcandrew Okwei
 * @version 3.0 (September 30 2022)
 */
public class MedicalBillDriver{

    public static void displayBill( Doctor doc ){
        System.out.println (Doctor.getBill(10.00) );
    }

    public static void main( String[] args ){
        Doctor physician = new Doctor();
        Surgeon earSurgeon = new Surgeon();

        displayBill( physician );
        displayBill( earSurgeon );
    }
}