
/**
 * Datenelemente mit einer Ganzzahl als Wert.
 * 
 * @author Arbeitskreis
 * @version 1.0
 */
public class ZAHLDATEN implements DATENELEMENT
{
    /** Der Wert des Elements */
    private int wert;
    
    /**
     * Legt das Datenelement mit dem gegebenen Wert an.
     * @param w Wert des Datenelements
     */
    public ZAHLDATEN(int w)
    {
        wert = w;
    }


    /**
     * Vergleicht das vorhandene Datenelement mit dem &uuml;bergebenen.
     * @param wert Referenz auf den Vergleichswert
     * @return 1: das aktuelle Element ist kleiner als das Vergleichselement<br>
     *      *          0: das aktuelle Elelemt hat den gleichen Wert wie das Vergleic-hselement<br>
     *          1: das aktuelle Element ist gr&ouml;&szlig;er als das Vergleichselement
     */
    public int vergleichen(DATENELEMENT wert, String type)
    {
        int vergleich;
        vergleich = ((ZAHLDATEN) wert).wert;
        if (this. wert == vergleich)
        {
            return 0;
        }
        else if (this. wert < vergleich)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
    
    /**
     * Gibt die relevante Information des Datenelements auf die Konsole aus.
     */
    public String ausgeben (String type)
    {
        System. out. println ("Das Datenelement hat den Wert: " + wert);
        return "";

    }
}
