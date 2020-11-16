/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula078.gui.jlabel.e.imageicon;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author eliezer
 */
public class ControleLabel extends JFrame {

    public ControleLabel() {
        super("Label");

        JLabel simples = new JLabel("Label Simples");
        simples.setToolTipText("Meu Tooltip");

        Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28);

        JLabel label = new JLabel("Label Simples");
        simples.setToolTipText("Meu Tooltip");
        label.setFont(fonte);
        label.setForeground(Color.red);

        ImageIcon icon = new ImageIcon(getClass().getResource("folder/IMG_6262.JPG"));
        JLabel imagem = new JLabel(icon);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(simples);
        c.add(label);
        c.add(imagem);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 00);
        setVisible(true);

    }

}
