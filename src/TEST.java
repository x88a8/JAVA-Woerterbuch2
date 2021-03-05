
public class TEST
{
    // Attribute
   
    private WOERTERBUCH2 duden;

    //Konstruktor

    public TEST()
	{
        duden = new WOERTERBUCH2();
    }
	public static void main(String[] args) {
    	testDurchlauf();
	}
    //Methoden
    
    public static void testDurchlauf()
	{
		WOERTERBUCH2 duden = new WOERTERBUCH2();

		String English[] = {"Zero","One","Two","Three","Four", "Five","Six","Seven","Eight","Nine","Ten", "Eleven","Twelve","Thirteen","Fourteen","Fifteen", "Sixteen","Seventeen","Eighteen","Nineteen"};
		String Deutsch[] = {"Goanix", "Oans","Zwo","Drei", "Füa", "fünf", "sexxe", "simme", "achte", "neine", "zene", "oife", "zwoife", "dreizea", "füazea", "fuchzea", "sechzea", "süpzea", "achzea", "neizea"};

		for (int i = 0; i < English.length; i++) {
			duden.Einfuegen(English[i], Deutsch[i]);
		}


		for (int i = 0; i < (8 + 1); i++) {
			duden.Uebersetzen(English[i], "EnDe");
		}
		for (int i = 9; i < (13 + 1); i++) {
			duden.Uebersetzen(Deutsch[i], "DeEn");
		}

	}
}


