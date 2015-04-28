
package aufgabe03;

/**
 *
 * @author sheela
 */

public class Student extends Mensch //Aufgabe03
{
    String matrikelnummer;
    String studiengang;
    
    public Student(String vorname, String nachname, int alter, String matrikelnummer, String studiengang)
    {
        super (vorname, nachname, alter);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;        
    }

    @Override
    public void Status() 
    {
        System.out.println("Es handelt sich hierbei um einen Menschen mit folgenden Daten: " + vorname + " " + nachname + ", " + alter + "Jahre.");
    }
    
    public static void main(String[] args)
    {
        Mensch sheela = new Mensch("Sheela", "Breitfuss", 20);
        sheela.Status();
    
        sheela = new Student("Sheela", "Breitfuss", 20, "1410653057", "Web Business & Technology");
        sheela.Status();
    }   
}
