/**
 * Beschreibt ein allgemeines Element des Baums.
 * 
 * @author Arbeitskreis
 * @version 1.0
 */
abstract class BAUMELEMENT
{

    /**
     * Der Konstruktor ist aus Dokumentationsgr&uuml;nden vorhanden
     */
    public BAUMELEMENT()
    {
        // keine spezielle Aufgabe
    }

    /**
     * Sucht im Baum nach dem gegebenen Datenelelement.
     * @param wert Referenz auf ein Datenelement mit dem Vergleichswert
     * @return Referenz auf das Datenelement, wenn der Wert gefunden wurde<br>null: sonst
     */
    public abstract DATENELEMENT suchen(DATENELEMENT wert, String type);
    
    /**
     * F&uuml;gt ein neues Datenelement in den Baum ein.
     * Der Wert darf noch nicht vorkommen
     * @param wert Referenz auf das einzuf&uuml;gende Datenelement
     */
    public abstract BAUMELEMENT einfuegen(DATENELEMENT wert);
    
     /**
     * Durchl&auml;ft den Baum in Preorder
     */
    public abstract void preOrder();
    
    /**
     * Durchl&auml;ft den Baum in Inorder
     */
    public abstract void inOrder();
    
    /**
     * Durchl&auml;ft den Baum in Postorder
     */
    public abstract void postOrder();

    public abstract int anzahlKnotenGeben();
}