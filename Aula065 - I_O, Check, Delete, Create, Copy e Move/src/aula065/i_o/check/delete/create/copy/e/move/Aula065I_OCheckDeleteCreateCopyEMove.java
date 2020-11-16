/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula065.i_o.check.delete.create.copy.e.move;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author eliezer
 */
public class Aula065I_OCheckDeleteCreateCopyEMove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Path caminho = Paths.get("/home/eliezer/Documents/Arquivo/ListaDeContas.txt");
        System.out.println(Files.exists(caminho));
        System.out.println(Files.isDirectory(caminho));
        System.out.println(Files.isRegularFile(caminho));
        System.out.println(Files.isReadable(caminho));
        System.out.println(Files.size(caminho));
        System.out.println(Files.isExecutable(caminho));
        System.out.println(Files.getLastModifiedTime(caminho));
        System.out.println(Files.getOwner(caminho));
        System.out.println(Files.probeContentType(caminho));

        /*Deletar*/
        //   Files.delete(caminho);
        // System.out.println(Files.deleteIfExists(caminho));
        /*create*/
        Path caminh = Paths.get("/home/eliezer/Documents/Arquivo/arquivo.txt");
        // Files.createFile(caminh);
        Files.write(caminh, "Tem texto aqui".getBytes());

        /*copiar*/
        Path copia = Paths.get("/home/eliezer/Documents/Arquivo/copiaArquivo.txt");
        Files.copy(caminh, copia, StandardCopyOption.REPLACE_EXISTING);

        /*mover*/
        Path mover = Paths.get("/home/eliezer/Documents/Arquivo/move/arquivo.txt");
        Files.createDirectories(mover.getParent());
        Files.move(caminh, mover,StandardCopyOption.REPLACE_EXISTING);
    }

}
