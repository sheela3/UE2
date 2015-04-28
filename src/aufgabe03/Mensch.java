

package aufgabe03;

/**
 *
 * @author sheela
 */

public class Mensch //Aufgabe03
{
    String vorname;
    String nachname;
    int alter;
    
    public Mensch(String vorname, String nachname, int alter)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }
    
    public void Status()
    {
        System.out.println("Es handelt sich hierbei um einen Menschen mit folgenden Daten: " + vorname + " " + nachname + ", " + alter + "Jahre.");
    }
}
