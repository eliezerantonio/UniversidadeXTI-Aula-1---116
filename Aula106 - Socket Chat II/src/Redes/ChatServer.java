/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Redes;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eliezer
 */
public class ChatServer {

    ArrayList<PrintWriter> escritores = new ArrayList();

    public ChatServer() {

        ServerSocket server;
        Scanner leitor;
        try {
            server = new ServerSocket(5000);
            while (true) {
                Socket socket = server.accept();
                new Thread(new EscutaCliente(socket)).start();
                PrintWriter p = new PrintWriter(socket.getOutputStream());
                escritores.add(p);
            }
        } catch (IOException ex) {
            Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void encaminharParaTodos(String texto) {
        for (PrintWriter w : escritores) {

            try {
                w.println(texto);
                w.flush();
            } catch (Exception IO) {
            }
        }
    }

    private class EscutaCliente implements Runnable {

        Scanner leitor;

        public EscutaCliente(Socket socket) {

            try {
                leitor = new Scanner(socket.getInputStream());
            } catch (IOException ex) {
                Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        @Override
        public void run() {
            try {
                String texto;
                while ((texto = leitor.nextLine()) != null) {
                    System.out.println(texto);
                    encaminharParaTodos(texto);
                }
            } catch (Exception e) {
            }

        }

    }

    public static void main(String[] args) throws IOException {
        new ChatServer();
    }
}
