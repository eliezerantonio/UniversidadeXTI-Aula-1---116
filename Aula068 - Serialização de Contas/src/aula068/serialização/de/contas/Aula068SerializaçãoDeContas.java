/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula068.serialização.de.contas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class Aula068SerializaçãoDeContas {

    public ArrayList<Conta> buscarContas() throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("/home/eliezer/Documents/Arquivo/contasNew.ser");) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
             return(ArrayList<Conta>) ois.readObject()  ;
            }
        }

       
    }
 public void armazenarContas(ArrayList<Conta> contas) throws FileNotFoundException, IOException {
   
    try(     FileOutputStream fos = new FileOutputStream("/home/eliezer/Documents/Arquivo/contasNew.ser")){
        try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(contas);
            
        }
    }
        
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
         Aula068SerializaçãoDeContas operacao = new Aula068SerializaçãoDeContas();
        ArrayList<Conta> contas = new ArrayList();

        contas.add(new Conta("Eliezer Antonio", 2012));
        contas.add(new Conta("Eliany Cabral", 201221.2));
        contas.add(new Conta("Sandra  Brande", 201221.30));

       operacao.armazenarContas(contas);
        //  conta.buscarContas(contas);
       
        ArrayList<Conta> contas2 = operacao.buscarContas();
        for (Conta next : contas2) {
            next.mostrarSaldo();
        }

    }

}
