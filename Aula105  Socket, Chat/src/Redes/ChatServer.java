/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Redes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eliezer
 */
public class ChatServer {

    public ChatServer() {
        ServerSocket server;
        Scanner leitor;
        try {
            server = new ServerSocket(5000);
            while (true) {
                Socket socket = server.accept();
                new Thread(new EscutaCliente(socket)).start();

            }
        } catch (IOException ex) {
            Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
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
                    System.out.println( texto);
                }
            } catch (Exception e) {
            }

        }

    }

    public static void main(String[] args) throws IOException {
        new ChatServer();
    }
}
