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

/**
 *
 * @author eliezer
 */
public class GridLayouts extends JFrame {

    public GridLayouts() {
        super("GridLayouts");

        Container c = getContentPane();
        /*    c.setLayout(new BorderLayout(10,10));
        c.add(BorderLayout.SOUTH, new JButton("S"));
        c.add(BorderLayout.NORTH, new JButton("N"));
        c.add(BorderLayout.CENTER, new JButton("C"));
        c.add(BorderLayout.EAST, new JButton("E"));
        c.add(BorderLayout.WEST, new JButton("W"));*/
        c.setLayout(new GridLayout(2, 3));//duas linhas e tres colunas
        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        c.add(new JButton("4"));
        c.add(new JButton("5"));
        c.add(new JButton("6"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }
}
