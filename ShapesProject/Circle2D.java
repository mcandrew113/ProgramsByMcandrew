package ShapesProject;

public class Circle2D extends Shape2D{
    public double radius ;

public Circle2D( double r) {
    radius = Math.PI * r * r;
}

@Override
public double get2DArea() {    
    return radius;
}

}