/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula066.i_o.directory.e.filesystem;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author eliezer
 */
public class Aula066I_ODirectoryEFilesystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();

        /*Listar conteudo de um diretorio*/
        Path dir = Paths.get("/home/eliezer");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path : stream) {
                System.out.println(path.getFileName());

            }
        } catch (IOException | DirectoryIteratorException e) {
            e.printStackTrace();
        }
        /* Vendo particoes  */
        FileSystem fs = FileSystems.getDefault();
        System.out.println("----------------------------------");
        for (FileStore store : fs.getFileStores()) {

            System.out.println("Unidade: " + store.toString());
            System.out.println("TotalB: " + store.getUsableSpace());
            System.out.println("Disponivel: " + store.getUsableSpace());
            System.out.println("Quantidade usada: " +(store.getTotalSpace() -store.getUsableSpace() ));

        }

    }

}
