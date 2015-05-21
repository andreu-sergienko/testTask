package figures;

/**
 * Created by Nevazno on 21.05.15.
 */
public class Trapeze extends Figure {
    public Double a, b, h;

    public Trapeze(){
        a = 2.0;
        b = 5.0;
        h = 4.0;
        setColor("white");
    }

    public Trapeze(String color,Double a,Double b,Double h){
        setColor(color);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public Double getArea() {
        return rounding((a+b)/2*h);
    }

    public Double getSide(){
        return rounding(h);
    }

    public void draw(){
        super.draw();
        System.out.println("side length: "+getSide()+" ed., color: "+getColor());
    }
}
