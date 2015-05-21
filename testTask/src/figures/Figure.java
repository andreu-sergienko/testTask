package figures;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Nevazno on 21.05.15.
 */
public abstract class Figure {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Double getArea();

   public void draw(){
       System.out.print("Figure: " + this.getClass().getSimpleName() + ", area: " + getArea() + " kv.ed., ");
   }

   public Double rounding(Double a){
        return new BigDecimal(a).setScale(1, RoundingMode.HALF_UP).doubleValue();
   }
}
