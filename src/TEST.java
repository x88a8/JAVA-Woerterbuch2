
public class TEST
{
    // Attribute
   
    private WOERTERBUCH2 duden;
	public Dictionary gui;
    //Konstruktor

    public TEST()
	{
        duden = new WOERTERBUCH2();
    }
	public static void main(String[] args) {
		testDurchlf();
	}
    //Methoden
    
    public static void testDurchlf()
	{
		WOERTERBUCH2 duden = new WOERTERBUCH2();

		String English[] = {"Zero","One","Two","Three","Four", "Five","Six","Seven","Eight","Nine","Ten", "Eleven","Twelve","Thirteen","Fourteen","Fifteen", "Sixteen","Seventeen","Eighteen","Nineteen"};
		String Deutsch[] = {"Null", "Eins","Zwei","Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn", "Elf", "Zwölf", "Dreizehn", "Vierzehn", "Fünfzehn", "Sehchzehn", "Siebzehn", "Achtzehn", "Neunzehn"};

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


