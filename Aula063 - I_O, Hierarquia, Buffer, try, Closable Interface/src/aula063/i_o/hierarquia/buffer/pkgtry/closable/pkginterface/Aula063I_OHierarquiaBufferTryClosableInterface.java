/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula063.i_o.hierarquia.buffer.pkgtry.closable.pkginterface;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author eliezer
 */
public class Aula063I_OHierarquiaBufferTryClosableInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       //para arquivos grandes
        
        Path caminho = Paths.get("/home/eliezer/Documents/Arquivo/IO2.txt");
        Charset utf8 = StandardCharsets.UTF_8;
        /*Escrita*/
        try (BufferedWriter w = Files.newBufferedWriter(caminho, utf8)) {

            w.write("Eliezer \n");
            w.write("Antonio");
            //  w.flush(); //para gravar as linhas
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*Leitura*/
        try (BufferedReader reader = Files.newBufferedReader(caminho, utf8)) {
            String linha = null;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
