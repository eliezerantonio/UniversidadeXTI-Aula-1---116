/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula062.i_o.path.leitura.e.escrita;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author eliezer
 */
public class Aula062I_OPathLeituraEEscrita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Java 7 usa-se path antes usava-se file
        Path caminho = Paths.get("/home/eliezer/Documents/Arquivo/IO.txt");
        System.out.println(caminho.toAbsolutePath());// mostra o caminho exato do arquivo 
        System.out.println(caminho.getParent());// caminho do pai
        System.out.println(caminho.getRoot());
        System.out.println(caminho.getFileName());
        /*criacao de diretorio*/
        Files.createDirectories(caminho.getParent());
        /*escrever e ler arquivos*/
        byte[] bytes = "Meu Texto".getBytes();
        Files.write(caminho, bytes); //cria, limpa e escreve

        byte[] retorno = Files.readAllBytes(caminho);
        System.out.println(new String(retorno));
    }

}
