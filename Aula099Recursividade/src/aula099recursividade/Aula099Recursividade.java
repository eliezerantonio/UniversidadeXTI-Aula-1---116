/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula099recursividade;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eliezer
 */
public class Aula099Recursividade {

    /* 10 +(10-1)/*/
    public static int soma(int x) {
        if (x == 0) {
            return x;
        } else {
            System.out.println(x);
            return x + soma(x - 1);
        }

    }

    /**/
    /**
     *
     * @param x
     * @param e
     * @return
     */
    public static int potencia(int x, int e) {

        if (e == 1) {
            return x;
        } else {
            int y = x * potencia(x, e - 1);
            System.out.print(e + " ");
            return y;
        }

    }

    public static void listar(Path path) {
        if (Files.isRegularFile(path)) {
            System.out.println(path.toAbsolutePath());
        } else {
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
               String s= "\n " +path.toAbsolutePath();
                System.err.println(s.toUpperCase());
                //retorna arquivo 

                for (Path p : stream) {
                 
                    listar(p);
                }

            } catch (IOException ex) {
                Logger.getLogger(Aula099Recursividade.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(soma(10));
        System.out.println(potencia(3, 4));
        listar(Paths.get("/media/eliezer/237F62431DE85EB3/Aulas/JAVA"));
    }

}
