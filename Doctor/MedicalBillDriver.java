package Doctor;
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