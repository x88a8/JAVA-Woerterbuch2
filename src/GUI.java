import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JLabel labelEnglish;
    private JLabel labelDeutsch;
    private JLabel labelUeberschrift;
    private JTextField Textfield_English = new JTextField(10);
    private JTextField Textfield_Deutsch = new JTextField(10);
    private JButton buttonUebersetzen;

    WOERTERBUCH2 duden = new WOERTERBUCH2();
    String English[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine","Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String Deutsch[] = {"Null", "Eins","Zwei","Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn", "Elf", "Zwölf", "Dreizehn", "Vierzehn", "Fünfzehn", "Sehchzehn", "Siebzehn", "Achtzehn", "Neunzehn"};

    public void initDuden() {
        for (int i = 0; i < English.length; i++) {
            duden.Einfuegen(English[i], Deutsch[i]);

            System.out.println("Inserted: d-"+Deutsch[i]+" e-"+English[i]);
        }
        System.out.println("Crated Duden");
    }

    public GUI(String titel) {


        setTitle(titel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        setSize(250,200);
        setResizable(false);

        initComponents();

        add(labelUeberschrift);
        add(labelEnglish);
        add(labelDeutsch);
        add(Textfield_English);
        add(Textfield_Deutsch);
        add(buttonUebersetzen);



        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        labelUeberschrift = new JLabel("                    Uebersetzer                             ");
        labelEnglish = new JLabel("Englisch                     ");
        labelDeutsch = new JLabel("Deutsch");

        buttonUebersetzen = new JButton("Uebersetzen");
        buttonUebersetzen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String eng = Textfield_English.getText();
                System.out.println("suche nach: " + eng);
                String uebersetzung = duden.Uebersetzen(eng,"EnDe");
                if (uebersetzung.equals("Null") == false) {

                }

                System.out.println("fand: " + uebersetzung);

                Textfield_Deutsch.setText(uebersetzung);
            }
        });
    }

}
