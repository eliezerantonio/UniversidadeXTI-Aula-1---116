/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula076.gui.gridlayout.e.composição;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author eliezer
 */
public class GridLayou extends JFrame {

    public GridLayou() {
        super("GridLayouts");

        Container c = getContentPane();
        Container c2 = new JPanel();
        c2.setLayout(new GridLayout(4, 1));
        c2.add(new JButton("Ok"));
        c2.add(new JButton("Cancel"));
        c2.add(new JButton("Setup"));
        c2.add(new JButton("Help"));
        c.setLayout(new BorderLayout());

        c.add(BorderLayout.CENTER, new JButton("Centro"));
        c.add(BorderLayout.EAST,c2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

    }

    public static void main(String args[]) {
        new GridLayou();
    }
}
