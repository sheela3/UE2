
package aufgabe04_05;

import aufgabe04_05.Auto.color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author sheela
 */

public class Aufruf
{
    public static void main(String[] args)
    {
      
        Auto toyota = new Auto ((short) 4, (short)4, (short)220, (short)5, (short)0, color.Black);
        Auto kia = new Auto ((short) 8, (short) 4, (short) 180, (short) 5, (short) 0, color.Blue);
        Auto audi = new Auto ((short) 8, (short) 4, (short) 160, (short) 5, (short) 0, color.Red);
        Auto vw = new Auto ((short) 8, (short) 4, (short) 90, (short) 5, (short) 0, color.Silver);
        Auto suzuki = new Auto ((short) 8, (short) 4, (short) 70, (short) 5, (short) 0, color.Blue);
       
        List<Auto> l = new ArrayList<Auto>();
        l.add(vw);
        l.add(toyota);
        l.add(suzuki);
        l.add(audi);
        l.add(kia);
        
        Collections.sort(l);
        
        for(Auto a : l)
        {
            System.out.println("Das Auto hat " + a.getPs() + " PS.");
        }        
    }
}
