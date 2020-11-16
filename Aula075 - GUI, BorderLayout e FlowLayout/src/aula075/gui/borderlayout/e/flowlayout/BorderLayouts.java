/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula075.gui.borderlayout.e.flowlayout;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author eliezer
 */
public class BorderLayouts extends JFrame {

    public BorderLayouts() {
        super("BorderLayout's");

        JButton botao1 = new JButton("1");
        JButton botao2 = new JButton("2");
        JButton botao3 = new JButton("3");
        JButton botao4 = new JButton("4");
        JButton botao5 = new JButton("5");
        Container c = getContentPane();
        c.add(BorderLayout.NORTH, botao1);
        c.add(BorderLayout.SOUTH, botao2);
        c.add(BorderLayout.CENTER, botao3);
        c.add(BorderLayout.EAST, botao4);
        c.add(BorderLayout.WEST, botao5);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

}
