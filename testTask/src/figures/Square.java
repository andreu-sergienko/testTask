package figures;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Nevazno on 21.05.15.
 */
public class Square extends Figure {

    Double side;

    public Square(){
        setColor("grey");
        side = 5.0;
    }

    public Square(String color,Double side){
        setColor(color);
        this.side = side;
    }

    @Override
    public Double getArea() {
        return rounding(side*side);
    }

    public Double getSide(){
        return rounding(side);
    }

    public void draw(){
        super.draw();
        System.out.println("side length: " + getSide() + " ed., color: " + getColor());
    }


}
