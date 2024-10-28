
public class Circle extends Figure{
    Circle(){
        super();
    }
    Circle(double dim1){
        super(dim1);
    }
    
    @Override
    public void calculateArea(){
        double area  = Math.PI*(dim1*dim1);
        System.out.println("Area of Circle = " + area);
    }
    @Override
    public void calculatePerimeter(){
        double perimeter = 2*Math.PI*dim1;
        System.out.println("Perimeter of Circle = " + perimeter);
    }
    
}
