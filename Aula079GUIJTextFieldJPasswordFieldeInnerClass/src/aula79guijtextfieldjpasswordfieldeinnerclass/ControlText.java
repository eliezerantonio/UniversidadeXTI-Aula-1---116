/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula79guijtextfieldjpasswordfieldeinnerclass;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author eliezer
 */
public class ControlText extends JFrame implements ActionListener {

    JLabel loginlb = new JLabel("Login");
    JTextField loginText = new JTextField();
    JLabel senhaLb = new JLabel("senha");
    JPasswordField senhaText = new JPasswordField();
    JButton okBt, cancelarBt;

    public ControlText() {
        super("Textos e senhas");
        okBt = new JButton("ok");
        okBt.addActionListener(new BotaoOkListener());
        //  okBt.addActionListener(this);
        cancelarBt = new JButton("Cancelar");
        cancelarBt.addActionListener(new BotaoCancelarListener());
        //   cancelarBt.addActionListener(this);
        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 2));
        c.add(loginlb);
        c.add(loginText);
        c.add(senhaLb);
        c.add(senhaText);
        c.add(okBt);
        c.add(cancelarBt);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    class BotaoOkListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = "Login: " + loginText.getText() + "\n senha: " + new String(senhaText.getPassword());
            JOptionPane.showMessageDialog(null, s);
        }

    }

    class BotaoCancelarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            loginText.setText("");
            senhaText.setText("");
        }

    }

    /* @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okBt) {

            String s = "Login: " + loginText.getText() + "\n senha: " + new String(senhaText.getPassword());
            JOptionPane.showMessageDialog(null, s);
        } else if (e.getSource() == cancelarBt) {
            loginText.setText("");
            senhaText.setText("");
        }

    }*/

     }
