/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula058.string.principais.operações;

import java.util.Scanner;

/**
 *
 * @author eliezer
 */
public class Aula058StringPrincipaisOperações {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "JAVA";
        String s2 = s + " Naruto";
        String s3 = new String("Dragon Ball");
        char array[] = {'j', 'A', 'V', 'A'};

        //operacoes
        int tamanho = array.length;
        System.out.println(tamanho);
        //localizar um carecter dentro da String
        System.out.println(s.charAt(0));
        ;//retorna  a propria String
        System.out.println(s.toString());

        //localizacao
        
        //retorna a posicao desta letra se encontrar a leitura é feita da esquerda para direita
        System.out.println(s.indexOf("J"));
        ;//retorna a posicao desta letra se encontrar a leitura é feita  da direita para esquerda
        System.out.println(s.lastIndexOf("A"));
        ; //perginta se a String esta 
        System.out.println(s.isEmpty());

        // comparacao
        System.out.println("---------------------------");
        String x = "XTI";
//compara od dois valarores
        System.out.println(x.equals("xti"));
        //compara od dois valarores sem sencible case
        System.out.println(x.equalsIgnoreCase("xti"));
        //verififcaf se o texto comeca com determinado catacter
        System.out.println(x.startsWith("X"));
        //ver se terminada com determinado carcter
        System.out.println(x.endsWith("I"));
        
       int c="amor".compareTo("bola");//que vem priemriro é o amor ente resulado sera -1
        System.out.println(c);
        int a="123".compareTo("10");
        System.out.println(a);
        
        String olhar="olhe, olhe";
        //saber de uma determinadapalavra ou carecater se econtra na posiciap x
        
        
        
        
       // verrifcar se depois da posicao 0 com 4 carcteres existe aString olhe
        System.out.println( olhar.regionMatches(6, "olhar", 0, 4));
        
        
        //pegar o pedaco de uma String
        
       String nome ="Eliezer Antonio";
       String nom=nome.substring(7);
        System.out.println(nom);//imprime aontonio
       
        //Modificacao
        System.out.println("-------------------------------");
        
        String concatenar=nome.concat(" é foda");
        System.out.println(concatenar);
        String trocar=nome.replace('z', 's'); //troquei a letra z por s
        System.out.println(trocar);
        String trocar2=nome.replaceFirst(" ", "-"); // trocando o primeiro espaco em branco se eu usar replaceAll troco todos os espacos
       
        nome.toLowerCase();//mete tudo maisculo
        nome.toUpperCase(); //mete tudo maiusculo
        nome.trim();// remove todo espaco da estring
        
        
        
        

    }

}
