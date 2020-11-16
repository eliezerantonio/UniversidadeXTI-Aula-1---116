/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula083guijtextareaejfilechooser;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import static sun.security.krb5.Confounder.bytes;

/**
 *
 * @author eliezer
 */
public class ControleTextArea extends JFrame implements ActionListener {

    JButton botao = new JButton("Abrir Arquivo");
    JTextArea texto = new JTextArea();

    JScrollPane scroll = new JScrollPane(texto);

    public ControleTextArea() {
        super("Editor de textos");
        botao.setFont(new Font("serif", Font.PLAIN, 26));
        botao.addActionListener(this);
        texto.setFont(new Font("serif", Font.PLAIN, 26));
        Container c = getContentPane();
        c.add(BorderLayout.CENTER, scroll);
        c.add(BorderLayout.SOUTH, botao);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser c = new JFileChooser();
        c.showOpenDialog(this);
        File file = c.getSelectedFile();
        try {
            Path caminho = Paths.get(file.getAbsolutePath());
            String retorno = new String(Files.readAllBytes(caminho));
            texto.setText(retorno);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Nao consehuimos abrir o seu arquivo.Lamento");
        }
    }

}
