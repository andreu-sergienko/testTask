package figures;

/**
 * Created by Nevazno on 21.05.15.
 */
public class Circle extends Figure {
    Double radius;

    public Circle(){
        radius = 3.0;
        setColor("green");
    }

    public Circle(String color,Double radius){
        setColor(color);
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return rounding(3.14*radius*radius);
    }

    public Double getRadius(){
        return rounding(radius);
    }

    public void draw(){
        super.draw();
        System.out.println("radius: "+getRadius()+" ed., color: "+getColor());
    }
}
