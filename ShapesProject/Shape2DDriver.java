package ShapesProject;

public class Shape2DDriver extends Shape2D{ 

    public static void displayArea(Shape2D obj){
        System.out.println("The area is:  " + Math.round((obj.get2DArea())*10.0)/10.0);        
    }
       
    public static void main(String[]args){       
        displayArea(new Rectangle2D(6,7.43843));
        displayArea(new Circle2D(12));      
       }

    @Override
    public double get2DArea() {        
        return 0;
    }   
}