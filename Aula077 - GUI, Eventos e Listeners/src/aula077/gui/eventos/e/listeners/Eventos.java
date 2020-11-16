/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula077.gui.eventos.e.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author eliezer
 */
public class Eventos extends JFrame implements ActionListener {
  JButton botao = new JButton("Clique aqui");
    public Eventos() {
        super("Eventos");

      
        botao.addActionListener(this);
        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     botao.setText("Clicou");
    }

}
