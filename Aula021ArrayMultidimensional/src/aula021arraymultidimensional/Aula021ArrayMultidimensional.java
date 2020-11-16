
package aula021arraymultidimensional;

import java.util.Arrays;
import java.util.Random;

public class Aula021ArrayMultidimensional {

    public static void main(String[] args) {
        String[] uma = {"Eliezer", "Ana"};
        System.out.println(Arrays.toString(uma));
        System.out.println("---------------------------------------------");
        System.out.println("Array multidimensional");
        String[][] duas = {{"Eliezer", "Masculino", "M"}, {"Ana,Feminino", "F"}};

        System.out.println(duas[0][2]);
        System.out.println(duas[1][0]);
        System.out.println("Sabendo total de elementos na primeira dimensao");
        System.out.println(duas.length);
        System.out.println("Sabendo total de elementos no array interno");
        System.out.println(duas[0].length);

        System.out.println("------------------------------------------");
        System.out.println("jogo de cartas");
        System.out.println("------------------------------------------");

        String faces[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete"};
        String nipes[] = {"Espadas", "Ouros", "Copas", "Paus"};

        Random r = new Random();
        int indeceFace = r.nextInt(faces.length);
        String face = faces[indeceFace];

        int indeceNipe = r.nextInt(nipes.length);
        String nipe = nipes[indeceNipe];
        String carta = face + " de " + nipe;
        System.out.println(carta);
        
        
        System.out.println(r.nextInt(10));
    }

}
