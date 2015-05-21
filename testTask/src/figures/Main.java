package figures;

import figures.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Nevazno on 21.05.15.
 */
public class Main {
    public static void main(String[] args)
    {
        final Random random = new Random();
        List<Figure> lists = new LinkedList<Figure>();

        int amount = random.nextInt(20);

        for (int i=0;i<amount;i++){
            lists.add(generator());
        }

        for (Figure item:lists){
            item.draw();
        }


    }
    public static Figure generator(){
        List<String> colors = new ArrayList<String>();

        colors.add("red");
        colors.add("yellow");
        colors.add("black");
        colors.add("grey");
        final Random random = new Random();
        String color = colors.get(random.nextInt(colors.size()));
        int n=random.nextInt(4);
        switch(n) {
            case 0: return new Square(color , Math.round(random.nextDouble()*10000)/100.0 );
            case 1: return new Circle(color , Math.round(random.nextDouble()*10000)/100.0 );
            case 2: return new Triangle(color , Math.round(random.nextDouble()*10000)/100.0 ,Math.round(random.nextDouble()*10000)/100.0 );
            case 3: return new Trapeze(color , Math.round(random.nextDouble()*10000)/100.0, Math.round(random.nextDouble()*10000)/100.0 , Math.round(random.nextDouble()*10000)/100.0  );
        }
        return null;
    }
}
