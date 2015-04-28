

package aufgabe04_05;

/**
 *
 * @author sheela
 */

public class Fahrzeug 
{
    short reifen;
    short ps;
    short tueren;
    boolean gestartet;
    short geschwindigkeit;
    public static int anzahl;

     public Fahrzeug(short reifen, short ps, short tueren, boolean gestartet, short geschwindigkeit) 
     {
        this.reifen = reifen;
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = gestartet;
        this.geschwindigkeit = geschwindigkeit;
    }

    public short getReifen() 
    {
        return reifen;
    }

    public void setReifen(short reifen) 
    {
        this.reifen = reifen;
    }

    public short getPs() 
    {
        return ps;
    }

    public void setPs(short ps) 
    {
        this.ps = ps;
    }

    public short getTueren() 
    {
        return tueren;
    }

    public void setTueren(short tueren) 
    {
        this.tueren = tueren;
    }

    public boolean isGestartet() 
    {
        return gestartet;
    }

    public void setGestartet(boolean gestartet) 
    {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit()
    {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit)
    {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static int getAnzahl()
    {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) 
    {
        Fahrzeug.anzahl = anzahl;
    }
    
    public void starten()
    {
        gestartet = true;
    }
    
    public void stoppen()
    {
        gestartet = false;
    }
    
    public void beschleunigen(short geschwindigkeit)
    {
        if(gestartet = true)
        {           
            if (geschwindigkeit + geschwindigkeit <= 250)
            {
                geschwindigkeit += geschwindigkeit;
            }
        }
    }  
    
    public void bremsen(short geschwindigkeit)
    {
        if(gestartet = true)
        {
            if(geschwindigkeit - geschwindigkeit >= 0)
            {
                geschwindigkeit -= geschwindigkeit;
            }
        }
    }   
}
