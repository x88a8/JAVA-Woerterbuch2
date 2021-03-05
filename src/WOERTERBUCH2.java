public class WOERTERBUCH2 {
    BAUM baum;

    WOERTERBUCH2() {
        baum = new BAUM();
    }

    void Uebersetzen(String wort, String type) {
        WORT daten;
        if (type == "EnDe") {
            daten = (WORT) baum.suchen(new WORT(wort,""), type);
            if (daten != null) {
                daten.ausgeben("de");
            } else {
                System.out.println("Unbekanntes Wort: " + wort);
            }
        } else if (type == "DeEn") {
            daten = (WORT) baum.suchen(new WORT("",wort), type);
            if (daten != null) {
                daten.ausgeben("en");
            } else {
                System.out.println("Unbekanntes Wort: " + wort);
            }
        } else {
            System.out.println("In meinem Chat wird NUR DEUTSCH gesprochen!") ;
            daten = null;
        }

    }

    void InhaltAusgeben() {
        baum.inOrder();
    }
    void Einfuegen(String english, String deutsch) {
        baum.einfuegen(new WORT(english, deutsch));
    }
}
