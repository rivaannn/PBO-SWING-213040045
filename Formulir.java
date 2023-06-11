package Pertemuan14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Formulir extends JFrame implements ActionListener {
    private JButton button;
    private JTextField textField;
    private JTextField textField2;

    private int nilai1 = 0;
    private int nilai2 = 0;
    private int hasil = 0;

    public Formulir() {
        button = new JButton("Hasil");
        button.addActionListener(this);
        textField = new JTextField();
        textField2 = new JTextField();

        setTitle("Tentang Penjumlahan");
        setLayout(new GridLayout(3,1));
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(textField);
        add(textField2);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!textField.getText().equals("") && !textField2.getText().equals("")) {
            nilai1 = Integer.parseInt(textField.getText());
            nilai2 = Integer.parseInt(textField2.getText());
            hasil = nilai1 + nilai2;
            JOptionPane.showMessageDialog(this, "Hasilnya adalah " + hasil);
        }
    }
}
