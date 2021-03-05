public class WORT implements DATENELEMENT{
    private String english;
    private String deutsch;

    public WORT(String english, String deutsch) {
        this.deutsch = deutsch;
        this.english = english;
    }

    public int vergleichen(DATENELEMENT wert, String type) {
        String vergleich;
        if (type == "EnDe") {
            vergleich = ( (WORT) wert).english;
            if (this.english == vergleich) {
                return 0;
            } else {
                return 1;
            }
        } else if (type == "DeEn") {
            vergleich = ( (WORT) wert).deutsch;
            if (this.deutsch == vergleich) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public void ausgeben(String type) {
        if (type == "de") { System.out.println("Deutsch: " + deutsch); } else {System.out.println("Englisch: " + english); };
    }
}
