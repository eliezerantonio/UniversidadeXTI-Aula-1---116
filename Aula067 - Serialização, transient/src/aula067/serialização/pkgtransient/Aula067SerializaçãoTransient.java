package aula067.serialização.pkgtransient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 *
 * @author eliezer
 */
public class Aula067SerializaçãoTransient {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String nome[] = {"Eliezer", "Sandra"};
        /*Escrita de objecto*/
        FileOutputStream fos = new FileOutputStream("/home/eliezer/Documents/Arquivo/objectos.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(nome);
        oos.close();
        /*Leitura*/
        FileInputStream fis = new FileInputStream("/home/eliezer/Documents/Arquivo/objectos.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        String[] nomes1 = (String[]) ois.readObject();
        ois.close();
        System.out.println(Arrays.toString(nomes1));
    }

}
