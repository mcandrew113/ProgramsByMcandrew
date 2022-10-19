package ShapesProject;

public class Rectangle2D extends Shape2D{
public double area;

public Rectangle2D(double l,double w) {
	area=l*w;
	}	

@Override
public double get2DArea() {	
	return (area);
	}

}
