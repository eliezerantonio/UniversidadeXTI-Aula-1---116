/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula074.gui.introdução.jframe;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author eliezer
 */
public class Janela extends JFrame {

    public Janela() {
    super("Minha Janela");
        JButton botao = new JButton("Click");
        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

}
