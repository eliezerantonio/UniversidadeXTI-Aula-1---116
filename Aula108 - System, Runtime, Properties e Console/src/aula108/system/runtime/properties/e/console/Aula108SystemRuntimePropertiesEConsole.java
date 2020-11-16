/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula108.system.runtime.properties.e.console;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author eliezer
 */
public class Aula108SystemRuntimePropertiesEConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Properties p = System.getProperties();
        System.out.println(p.getProperty("java.version"));
        System.out.println(p.setProperty("xti.curoso.java.version", "1.0.0"));
        p.keySet();

        Set<Object> pk = p.keySet();

        for (Object key : pk) {
            System.out.println(key + " = " + p.get(key));
        }
        Console c = System.console();
        System.out.println("Usuario: ");
        String user = c.readLine();
        System.out.println("Senha: ");
        char[] pass = c.readPassword();
        System.out.println(" Usurio " + user + " senha " + new String(pass));

        Runtime.getRuntime().exec("firefox");

    }

}
