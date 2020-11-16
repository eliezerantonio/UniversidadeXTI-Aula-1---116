/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Redes;

import com.sun.glass.ui.Size;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author eliezer
 */
public class ChatCliente extends JFrame {

    Socket socket;
    PrintWriter escritor;
    Font fonte = new Font("Serif", Font.PLAIN, 26);
    JTextField textoEnviar = new JTextField();
    JButton botao = new JButton("Enviar");
    String nome;
    JTextArea textoRecebido;
    JScrollPane scroll;//barra de rodagem
    Scanner leitor;

    private class EscutaServidor implements Runnable {

        @Override
        public void run() {
            String texto;
            while ((texto = leitor.nextLine()) != null) {
                textoRecebido.append(texto +": " +"\n"  );

            }
        }

    }

    public ChatCliente(String nome) throws IOException {

        super("Chat " + nome);
        this.nome = nome;
        botao.setFont(fonte);
        textoEnviar.setFont(fonte);

        Container envio = new JPanel();
        envio.setLayout(new BorderLayout());
        envio.add(BorderLayout.CENTER, textoEnviar);
        envio.add(BorderLayout.EAST, botao);
        textoRecebido = new JTextArea();
        textoRecebido.setFont(fonte);

        JScrollPane scroll = new JScrollPane(textoRecebido);//ba

        ;

        getContentPane().add(BorderLayout.SOUTH, envio);

        getContentPane().add(BorderLayout.CENTER, scroll);
        setSize(500, 500);
        configurarRede();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        botao.addActionListener(
                (ActionEvent e) -> {
                    escritor.println(nome + " : " + textoEnviar.getText());
                    escritor.flush();//garantir que a sms foi enviada
                    textoEnviar.setText("");
                    textoEnviar.requestFocus();//metendo o cursor  na caixa de texto apos o envio

                }
        );

    }

    private void configurarRede() throws IOException {

        try {
            socket = new Socket("127.0.0.1", 5000);
            escritor = new PrintWriter(socket.getOutputStream());
            leitor = new Scanner(socket.getInputStream());
            new Thread(new EscutaServidor()).start();

        } catch (IOException e) {
        }
    }

    public static void main(String[] args) throws IOException {
        new ChatCliente("Ricardo");
        new ChatCliente("Sandra");
    }
}
