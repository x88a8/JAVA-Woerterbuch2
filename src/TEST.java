
public class TEST
{
    // Attribute
   
    private BAUM baum;

    //Konstruktor

    public TEST()
	{
        baum = new BAUM();
    }
	public static void main(String[] args) {
    	testDurchlauf();
	}
    //Methoden
    
    public static void testDurchlauf()
	{
		BAUM baum = new BAUM();
		String Deutsch[] = {"bb","abb","abab"};
		String Englisch[] = {"bba","baa","abab"};

		baum.einfuegen(new WORT (Englisch[0],Deutsch[0]));
		baum.einfuegen(new WORT (Englisch[1],Deutsch[1]));
		baum.einfuegen(new WORT (Englisch[2],Deutsch[2]));

		baum.preOrder();
		baum.inOrder();
		baum.postOrder();
		
		baum.anzahlKnotenGeben();
	}
}


