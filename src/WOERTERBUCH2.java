public class WOERTERBUCH2 {
    BAUM baum;

    WOERTERBUCH2() {
        baum = new BAUM();
    }

    void Uebersetzen(String wort, String type) {
        WORT daten;
        if (type == "EnDe") {
            daten = (WORT) baum.suchen(new WORT(wort,""), type);
        } else if (type == "DeEn") {
            daten = (WORT) baum.suchen(new WORT("",wort), type);
        } else {
            System.out.println("In meinem Chat wird NUR DEUTSCH gesprochen!") ;
            daten = null;
        }
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
