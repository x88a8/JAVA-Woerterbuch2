
/**
 * Datenelemente mit einer Zeichenkette als Wert.
 * 
 * @author Arbeitskreis
 * @version 1.0
 */

import java. text. Collator;
public class STRINGDATEN implements DATENELEMENT
{
    /** Der Wert des Elements */
    private String wert;
    /** Vergleichsobjekt */
    private Collator coll;
    
    /**
     * Legt das Datenelement mit dem gegebenen Wert an.
     * @param w Wert des Datenelements
     */
    public STRINGDATEN(String w)
    {
        wert = w;
        coll = Collator. getInstance ();
    }
    
    /**
     * Vergleicht das vorhandene Datenelement mit dem &uuml;bergebenen.
     * @param wert der Vergleichswert
     * @return -1: das aktuelle Element ist kleiner als das Vergleichselement<br>
     *          0: das aktuelle Elelemt hat den gleichen Wert wie das Vergleichselement<br>
     *          1: das aktuelle Element ist gr&ouml;&szlig;er als das Vergleichselement
     */
    public int vergleichen(DATENELEMENT wert, String type)
    {
        return coll. compare (this. wert, ((STRINGDATEN) wert). wert);
    }
    
    /**
     * Gibt die relevante Information des Datenelements auf die Konsole aus.
     */
    public String ausgeben(String type)
    {
        System. out. println ("Das Datenelement hat den Wert: " + wert);
        return "";

    }
}
