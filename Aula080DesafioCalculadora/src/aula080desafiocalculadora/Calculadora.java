/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula080desafiocalculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author eliezer
 */
public class Calculadora extends JFrame {

    JTextField displayText= new JTextField();
   
    JButton botao7 = new JButton("7");
    JButton botao8 = new JButton("8");
    JButton botao9 = new JButton("9");
    JButton botaoBar = new JButton("/");
    JButton botao4 = new JButton("4");
    JButton botao5 = new JButton("5");
    JButton botao6 = new JButton("6");
    JButton botaoMul = new JButton("*");
    JButton botao1 = new JButton("1");
    JButton botao2 = new JButton("2");
    JButton botao3 = new JButton("3");
    JButton botaoMen = new JButton("-");
    JButton botao0 = new JButton("0");
    JButton botaoPon = new JButton(".");
    JButton botaoIgu = new JButton("=");
    JButton botaoMai = new JButton("+");

    public Calculadora() {
        super("Calculadora");
        displayText.setFont(new Font("serif", Font.PLAIN,26));
        Container c2 = new JPanel();
        c2.setLayout( new GridLayout(4,4,5,5));
        c2.add(botao7);
        c2.add(botao8);
        c2.add(botao9);
        c2.add(botaoBar);
        c2.add(botao4);
        c2.add(botao5);
        c2.add(botao6);
        c2.add(botaoMul);
        c2.add(botao1);
        c2.add(botao2);
        c2.add(botao3);
        c2.add(botaoMen);
        c2.add(botao0);
        c2.add(botaoPon);
        c2.add(botaoIgu);
        c2.add(botaoMai);
        Container c = getContentPane();

        c.add(BorderLayout.NORTH, displayText);
        c.add(BorderLayout.CENTER, c2);
        setVisible(true);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
