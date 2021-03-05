public class WOERTERBUCH2 {
    BAUM baum;

    WOERTERBUCH2() {
        baum = new BAUM();
    }

    void Uebersetzen(String wort) {
        WORT daten;
        daten = (WORT) baum.suchen(new WORT(wort,""));
        if (daten != null) {
            daten.ausgeben();
        } else {
            System.out.println("Unbekanntes Wort: " + wort);
        }
    }

    void InhaltAusgeben() {
        baum.inOrder();
    }
    void Einfuegen(String english, String deutsch) {
        baum.einfuegen(new WORT(english, deutsch));
    }
}
