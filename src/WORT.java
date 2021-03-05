public class WORT implements DATENELEMENT{
    private String english;
    private String deutsch;

    public WORT(String english, String deutsch) {
        this.deutsch = deutsch;
        this.english = english;
    }


    public int vergleichen(DATENELEMENT wert) {
        return 0;
    }

    public void ausgeben() {
        System.out.println("Deutsch: " + deutsch + " Englisch :" + english);
    }
}
