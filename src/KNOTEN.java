
/**
 * Verwaltet einen Knoten des Baums.
 * 
 * @author Arbeitskreis 
 * @version 1.0
 */
public class KNOTEN extends BAUMELEMENT
{
    /** Referenz auf den linken Nachfolger */
    private BAUMELEMENT linkerNachfolger;
    /** Referenz auf den rechten Nachfolger */
    private BAUMELEMENT rechterNachfolger;
    /** Referenz auf das Datenelement */
    private DATENELEMENT daten;

    /**
     * Erzeugt einen Knoten mit den dem angegebenen Datenelement.
     * @param d Referenz auf das verwaltete Datenelement
     */
    public KNOTEN(DATENELEMENT d)
    {
        
        super();
        linkerNachfolger = new ABSCHLUSS();
        rechterNachfolger = new ABSCHLUSS();
        daten = d;
    }

    
    /**
     * Sucht im Baum nach dem gegebenen Datenelelement.
     * @param wert Referenz auf ein Datenelement mit dem Vergleichswert
     * @return Referenz auf das Datenelement, wenn der Wert gefunden wurde<br>null: sonst
     */
    public DATENELEMENT suchen(DATENELEMENT wert, String type)
    {
        if (daten.vergleichen (wert, type) == 0)
        {
            return daten;
        }
        else
        {
            if (daten.vergleichen(wert, type) > 0)
            {
                return linkerNachfolger.suchen(wert, type);
            }   
            else
                {
                    return rechterNachfolger.suchen(wert, type);
                }

        }
    }
    
    public BAUMELEMENT einfuegen(DATENELEMENT wert)
    {
        if (daten.vergleichen (wert, "") == 0)
        {
            wert.ausgeben ("");
        }
        else
        {
            if (daten.vergleichen(wert, "") > 0)
            {
                linkerNachfolger = linkerNachfolger.einfuegen(wert);
            }
            else
            {
                rechterNachfolger = rechterNachfolger.einfuegen (wert);
            }
        }
        return this;
    }
    
    /**
     * Durchl&auml;ft den Baum in Preorder
     */
    /**
     * Durchl&auml;ft den Baum in Preorder
     */
    public void preOrder()
    {
        daten.ausgeben("");
        linkerNachfolger.preOrder();
        rechterNachfolger.preOrder();
    }
    
    /**
     * Durchl&auml;ft den Baum in Inorder
     */
    public void inOrder()
    {
        linkerNachfolger.inOrder();
        daten.ausgeben("");
        rechterNachfolger.inOrder();
    }
    
    /**
     * Durchl&auml;ft den Baum in Postorder
     */
    public void postOrder()
    {
        linkerNachfolger.postOrder();
        rechterNachfolger.postOrder();
        daten.ausgeben("");
    }
    
    public int anzahlKnotenGeben()
    {
        return 1+rechterNachfolger.anzahlKnotenGeben()+  linkerNachfolger.anzahlKnotenGeben();
        
    }
    
}
