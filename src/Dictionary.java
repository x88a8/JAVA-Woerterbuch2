import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Fri Mar 05 13:20:20 CET 2021
 */



/**
 * @author unknown
 */
public class Dictionary extends JPanel {
    public Dictionary() {
        initComponents();
    }

    WOERTERBUCH2 duden = new WOERTERBUCH2();

    String English[] = {"Zero","One","Two","Three","Four", "Five","Six","Seven","Eight","Nine","Ten", "Eleven","Twelve","Thirteen","Fourteen","Fifteen", "Sixteen","Seventeen","Eighteen","Nineteen"};
    String Deutsch[] = {"Null", "Eins","Zwei","Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn", "Elf", "Zwölf", "Dreizehn", "Vierzehn", "Fünfzehn", "Sehchzehn", "Siebzehn", "Achtzehn", "Neunzehn"};

    public void initDuden() {
        for (int i = 0; i < English.length; i++) {
            duden.Einfuegen(English[i], Deutsch[i]);

            System.out.println("Inserted: d-"+Deutsch[i]+" e-"+English[i]);
        }
        System.out.println("Crated Duden");
    }

    private void button1ActionPerformed(ActionEvent e) {
        duden.InhaltAusgeben();
        String eng = (String) textField1.getText();
        String de = (String) textField2.getText();
        if (textField2.getText().isEmpty()) {
            String uebersetzung = duden.Uebersetzen(eng,"EnDe");
            System.out.println("auf d: " + uebersetzung);
            textField2.setText(uebersetzung);
        } else if (textField1.getText().isEmpty()) {
            String uebersetzung = duden.Uebersetzen(de,"DeEn");
            System.out.println("auf e: " + uebersetzung);
            textField1.setText(uebersetzung);
        } else {
            System.out.println("This shit aint workin");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Fabian Huber
        button1 = new JButton();
        textField1 = new JTextField();
        textField2 = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
        .swing.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing
        .border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.
        Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.red
        ), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override
        public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName(
        )))throw new RuntimeException();}});

        //---- button1 ----
        button1.setText("\u00dcBERSETZEN");
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- label1 ----
        label1.setText("Ueberstzer DE <> EN");
        label1.setFont(new Font("Consolas", Font.ITALIC, 36));

        //---- label2 ----
        label2.setText("Englisch");

        //---- label3 ----
        label3.setText("Deutsch");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
                                .addComponent(label2))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(label3)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(label3))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(2, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Fabian Huber
    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


     public static void main(String[] args) {
         JFrame frame = new JFrame("Uebersetzer");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Dictionary());
         frame.pack();
         frame.setVisible(true);

     }
}
