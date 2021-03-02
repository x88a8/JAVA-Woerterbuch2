
public class TEST
{
    // Attribute
   
    private BAUM baum;

    //Konstruktor

    public TEST()
    {
        
        baum = new BAUM();
    }

    //Methoden
    
    public void testDurchlauf()
	{
		BAUM baum = new BAUM();
		baum.einfuegen(new ZAHLDATEN (18));
		baum.einfuegen(new ZAHLDATEN (7));
		baum.einfuegen(new ZAHLDATEN (28));
		baum.einfuegen(new ZAHLDATEN (4));
		baum.einfuegen(new ZAHLDATEN (12));
		baum.einfuegen(new ZAHLDATEN (23));
		baum.einfuegen(new ZAHLDATEN (33));
		baum.einfuegen(new ZAHLDATEN (1));
		baum.einfuegen(new ZAHLDATEN (5));
		baum.einfuegen(new ZAHLDATEN (10));
		baum.einfuegen(new ZAHLDATEN (16));
		baum.einfuegen(new ZAHLDATEN (21));
		baum.einfuegen(new ZAHLDATEN (24));
		baum.einfuegen(new ZAHLDATEN (31));
		baum.einfuegen(new ZAHLDATEN (36));
		baum.preOrder();
		baum.inOrder();
		baum.postOrder();
		
		baum.anzahlKnotenGeben();
	}
}


