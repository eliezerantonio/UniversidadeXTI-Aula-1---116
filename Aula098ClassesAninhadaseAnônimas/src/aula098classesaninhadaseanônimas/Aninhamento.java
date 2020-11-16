/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula098classesaninhadaseanônimas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author eliezer
 */
public class Aninhamento extends JFrame {

    JButton botao;

    public Aninhamento() {
        super("Aninhamento");
        botao = new JButton("OK");
        botao.addActionListener(new ListenerAninhado());
        botao.addActionListener(new ActionListener() {//
            @Override
            public void actionPerformed(ActionEvent e) {
                 System.out.println("Classe anonima");
                }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300
        );
        getContentPane().add(botao);
        setVisible(true);
        setLocationRelativeTo(null);
    }
public class ListenerAninhado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Classe aninhanada");
        
        }
    
}
    
}
