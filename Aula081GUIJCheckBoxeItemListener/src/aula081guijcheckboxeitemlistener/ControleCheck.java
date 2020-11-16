/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula081guijcheckboxeitemlistener;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author eliezer
 */
public class ControleCheck extends JFrame {

    JCheckBox bold, italic;
    JTextField texto = new JTextField("Veja a fonte Mudar");

    public ControleCheck() {
        super("");
        bold = new JCheckBox("Bold");
        bold.addItemListener(new CheckListener());
        italic = new JCheckBox("Italic");
        italic.addItemListener(new CheckListener());

        texto.setFont(new Font("serf", Font.PLAIN, 26));

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(texto);
        c.add(bold);
        c.add(italic);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    class CheckListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {

            if (bold.isSelected() && italic.isSelected()) {
                texto.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 26));

            } else if (bold.isSelected()) {
                texto.setFont(new Font("serif", Font.BOLD, 26));

            } else if (italic.isSelected()) {
                texto.setFont(new Font("serif", Font.ITALIC, 26));

            } else {
                texto.setFont(new Font("serif", Font.PLAIN, 26));
            }
        }

    }
}
