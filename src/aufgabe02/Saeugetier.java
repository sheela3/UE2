
package aufgabe02;

/**
 *
 * @author sheela
 */

public abstract class Saeugetier //Aufgabe02
{
    String name;
    int alter;
    String geschlecht;
    
    public Saeugetier (String name, int alter, String geschlecht)
    {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }
    
    public abstract String printAll();   
}
