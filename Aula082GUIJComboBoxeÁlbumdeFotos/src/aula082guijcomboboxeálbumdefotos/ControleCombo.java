/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula082guijcomboboxeálbumdefotos;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author eliezer
 */
public class ControleCombo extends JFrame implements ItemListener {
    
    JComboBox<String> combo;
    JLabel label;
    ImageIcon[] imagens = {
        new ImageIcon(getClass().getResource("folder/01.JPG")),
        new ImageIcon(getClass().getResource("folder/02.PNG")),
        new ImageIcon(getClass().getResource("folder/03.JPG")),
        new ImageIcon(getClass().getResource("folder/04.JPG"))};
    
    public ControleCombo() {
        super("Album de fotos");
        Container c = getContentPane();
        combo = new JComboBox<String>();
        combo.setFont(new Font("serif", Font.PLAIN, 26));
        combo.addItem("OVOXO");
        combo.addItem("Thurday");
        combo.addItem("The Weeknd");
        combo.addItem("XO");
        combo.addItemListener(this);
        
        label = new JLabel(imagens[0]);
        
        c.add(BorderLayout.NORTH, combo);
        c.add(BorderLayout.CENTER, label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 530);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            label.setIcon(imagens[combo.getSelectedIndex()]);
        }
        
    }
    
}
