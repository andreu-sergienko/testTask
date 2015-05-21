package figures;

/**
 * Created by Nevazno on 21.05.15.
 */
public class Triangle extends Figure {
    Double a;
    Double b;

    public Triangle(){
        a = 5.0;
        b = 5.0;
        setColor("yellow");
    }

    public Triangle(String color,Double a,Double b){
        setColor(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public Double getArea() {
        return rounding(0.5*a*b);
    }

    public Double getHypotenuse(){
        return rounding(Math.sqrt(a * a + b * b));
    }

    public void draw(){
        super.draw();
        System.out.println("hypotenuse: " + getHypotenuse() + " ed., color: " + getColor());
    }
}
