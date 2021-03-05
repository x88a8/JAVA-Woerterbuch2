
/**
 * Verwaltet den Baum als Ganzes.
 * 
 * @author Arbeitskreis
 * @version 1.0
 */
public class BAUM
{
    /** Referenz auf die Wurzel des Baums */
    private BAUMELEMENT wurzel;

    /**
     * Legt einen leeren Baum an.
     */
    public BAUM()
    {
        wurzel = new ABSCHLUSS();
    }

   
    
    /**
     * Sucht im Baum nach dem gegebenen Datenelelement.
     * @param wert Referenz auf ein Datenelement mit dem Vergleichswert
     * @return Referenz auf das Datenelement, wenn der Wert gefunden wurde<br>null: sonst
     */
    public DATENELEMENT suchen(DATENELEMENT wert, String type)
    { 
            return wurzel.suchen(wert, type);
    }
    
    public void einfuegen(DATENELEMENT wert)
    {
        wurzel = wurzel.einfuegen(wert);
    }
    
    /**
     * Durchl&auml;ft den Baum in Preorder
     */
    public void preOrder()
    {
        wurzel.preOrder();
    }
    
    /**
     * Durchl&auml;ft den Baum in Inorder
     */
    public void inOrder()
    {
        wurzel. inOrder ();
    }
    
    /**
     * Durchl&auml;ft den Baum in Postorder
     */
    public void postOrder ()
    {
        wurzel.postOrder ();
    }
    
    public void anzahlKnotenGeben()
    {
        System.out.println("Anzahl Knoten: " + wurzel.anzahlKnotenGeben());
    }
}
