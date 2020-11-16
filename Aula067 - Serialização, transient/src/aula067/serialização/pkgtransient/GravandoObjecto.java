/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula067.serialização.pkgtransient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eliezer
 */
public class GravandoObjecto {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Conta conta = new Conta("Eliezer", 2012);
        Conta conta2 = new Conta("Eliezer", 2012);
        /*Escrita de objecto*/
        FileOutputStream fos = new FileOutputStream("/home/eliezer/Documents/Arquivo/contass.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(conta);
        oos.writeObject(conta2);
        oos.close();
        
        /*Leitura do objecto*/
        FileInputStream fis = new FileInputStream("/home/eliezer/Documents/Arquivo/contass.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Conta c1 = (Conta) ois.readObject();
        Conta c2 = (Conta) ois.readObject();
        ois.close();
        conta.mostrarSaldo();
        conta2.mostrarSaldo();
    }
}
