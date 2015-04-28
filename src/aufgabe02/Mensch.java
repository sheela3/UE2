
package aufgabe02;

/**
 *
 * @author sheela
 */

public class Mensch extends Saeugetier //Aufgabe02
{
    public Mensch(String name, int alter, String geschlecht)
    {
        super(name, alter, geschlecht);
    }

    public String printAll()
    {
        return name + "#" + alter + "#" + geschlecht;
    }
    
    public static void main (String [] args)
    {
        Mensch eins = new Mensch("Sheela Breitfuss", 20, "weiblich");
        System.out.println(eins.printAll());
    }
    
    
}
