
/**
 * Beschreibt das Abschlusselement des Baums.
 * 
 * @author Arbeitskreis
 * @version 2.00
 */
class ABSCHLUSS extends BAUMELEMENT
{

    /**
     * In der Klasse ABSCHLUSS fallen keine speziellen Initialisierungen an.
     */
    public ABSCHLUSS()
    {
        super ();
    }

    /**
     * Sucht im Baum nach dem gegebenen Datenelelement.
     * @param wert Referenz auf ein Datenelement mit dem Vergleichswert
     * @return Referenz auf das Datenelement, wenn der Wert gefunden wurde<br>null: sonst
     */
    public DATENELEMENT suchen(DATENELEMENT wert)
    {
        return null;
    }
    
    /**
     * F&uuml;gt ein neues Datenelement in den Baum ein.
     * Der Wert darf noch nicht vorkommen
     * @param wert Referenz auf das einzuf&uuml;gende Datenelement
     */
    public BAUMELEMENT einfuegen(DATENELEMENT wert)
    {
        return new KNOTEN (wert);
    }
    
    /**
     * Durchl&auml;ft den Baum in Preorder
     */
    public void preOrder()
    {
    }
    
    /**
     * Durchl&auml;ft den Baum in Inorder
     */
    public void inOrder()
    {
    }
    
    /**
     * Durchl&auml;ft den Baum in Postorder
     */
    public void postOrder()
    {
    }
    
    
    public int anzahlKnotenGeben()
    {
        return 0;
    }
}