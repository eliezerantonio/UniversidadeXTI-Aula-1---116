/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula075.gui.borderlayout.e.flowlayout;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author eliezer
 */
public class FlowLayouts extends JFrame {
    
    public FlowLayouts() {
        super("FloLayouts");
        
        JButton botao = new JButton("1");
        JButton botao2 = new JButton("2");
        JButton botao3 = new JButton("3");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(botao);
        c.add(botao2);
        c.add(botao3);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }
    public static void main (String []args){
        new FlowLayouts();
    }
}
