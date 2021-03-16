
/**
 * Schnittstelle f&uuml;r die verwalteten Datenelemente.
 * 
 * @author Arbeitskreis
 * @version 1.0
 */

interface DATENELEMENT
{
    /**
     * Vergleicht das vorhandene Datenelement mit dem &uuml;bergebenen.
     * @param wert der Vergleichswert
     * @return -1: das aktuelle Element ist kleiner als das Vergleichselement<br>
     *          0: das aktuelle Elelemt hat den gleichen Wert wie das Vergleichselement<br>
     *          1: das aktuelle Element ist gr&ouml;&szlig;er als das Vergleichselement
     */
    public int vergleichen(DATENELEMENT wert, String type);
    
    /**
     * Gibt die relevante Information des Datenelements auf die Konsole aus.
     */
    public String ausgeben (String type);

}
