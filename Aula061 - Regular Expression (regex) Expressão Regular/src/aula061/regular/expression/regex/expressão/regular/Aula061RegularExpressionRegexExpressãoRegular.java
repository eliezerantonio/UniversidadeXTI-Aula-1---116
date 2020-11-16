/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula061.regular.expression.regex.expressão.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author eliezer
 */
public class Aula061RegularExpressionRegexExpressãoRegular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //metodos
        String texto = "java";
        String padrao = "java";
        System.out.println(texto.matches(padrao));
        //ou
        System.out.println("eliezer".matches("eliezer"));
        System.out.println("-----------------------------------------------");
        //Modificadoes
        System.out.println("Modificadores");
        /*Modificadores
        (?i), ignora maisculas e minuscula
        (?x),comentarios
        (?m), Multilinhas
        (?s),dottal
         */
        System.out.println("elIezEr".matches("(?im)eliezer"));
        System.out.println("-----------------------------------------------");
        System.out.println("Metacaracteres");
        //Metacaracteres
        /*
        .qualquer caracter
        \d digitos [0-9]
        \D não é digito [^0-9]
        \s espaços [ \t\n\x0B\f\r]
        \S nao é espaco [^\s]
        \w letra [a-Za-Z_0-9]
        \W não é letra     
         
        . procura qualquer  caracter
        d procura numerosde 0-9
        D qualquer coisq uq enao seja  numero 
        s procura  espaços 
        S  procura coisas que nao seja espaço
        w  procura letra  numero a-z/A-Z/0-9
        W nao é letra
         */
        System.out.println("@".matches("."));
        System.out.println("2".matches("\\d"));
        System.out.println("PI".matches(".."));
        System.out.println("70294-070".matches("\\d\\d\\d\\d\\d-\\d\\d\\d"));
        System.out.println("------------------------------------------");
        //quantificadores
        System.out.println("Quatificadores");
        /*Quantificadores
        X{n}  X, exatamene n vezes
        X{n,} X, pelo menos n vezes
        X{n,m} X, pelo menos n mas não mias de m vezes
        X?  X,0 ou 1 vez
        x*  X,0u + vezes
        x+ X.1 ou + vezes
         */
        System.out.println("21".matches("\\d{2}"));
        System.out.println("123".matches("\\d{2,}"));
        System.out.println("123456".matches("\\d{2,5}"));
        System.out.println("a".matches(".?"));
        System.out.println("ab".matches(".*"));
        System.out.println("ab".matches(".+"));
        String cep = "70211-070";

        System.out.println(cep.matches("\\d{5}-\\d{3}"));
        System.out.println("12/02/1980".matches("\\d{2}/\\d{2}/\\d{4}"));
        System.out.println("-------------------------------");
        System.out.println("Metacaracter");
        //Metacatacter de fonteira

        /* //Metacatacter de fonteira
        ^ inicia
        $ finalizav
        ou /*
         */
        System.out.println("Pier21".matches("^Pier.*"));
        System.out.println("Pier21".matches(".*21$"));
        System.out.println("tem java aqui".matches(".*java.*"));
        System.out.println("tem java aqui".matches("^tem.*aqui$"));
        System.out.println("tem java aqui".matches("^tem.*aqui$"));
        System.out.println("sim".matches("sim|não"));
        System.out.println("-------------------------------");
        System.out.println("Agrupadores");
        /*
        [...]   agrupamento
        [a-z]   alcance
        [a-e][i-u] uniao
        [a-z&&[aeiou]] interseção
        [^abc]   excecao
        [a-z&&[m-p]] subtracao
        \x   fuga literal
         */

        System.out.println("x".matches("[a-z]"));
        System.out.println("9".matches("[0-9]"));
        System.out.println("True".matches("[tT]rue")); //true ou True 
        System.out.println("True".matches("[tT]rue"));
        System.out.println("True".matches("[tT]rue|[yY]es")); //True true ou yes Yes
        System.out.println("Yes".matches("[tT]rue|[yY]es"));//True true ou yes Yes
        System.out.println("Eliezer".matches("[A-Z][a-zA-Z]"));
        System.out.println("".matches("[^abc]lho")); //primeiro nome 
        System.out.println("crau".matches("cr[ae]u"));//procurando no meio
        System.out.println("rh@xtiuniversity.com".matches("\\w+@\\w+\\w+\\.\\w{2,3}"));
        String doce = "Qual é o doce mais doCe que o Doce?";
        Matcher matcher = Pattern.compile("(?i)doce").matcher("doce");

        while (matcher.find()) {
            System.out.println(matcher.group());

        }

        /*substituicoes*/
        String r = doce.replaceAll("(?i)", "DOCINHO");
        System.out.println(r);
        String rato = "o rato roeu a roupa do rei de rom";
        r = rato.replaceAll("r[aeiou]", "XX");
        System.out.println(r);
        r = "Tabular este texto".replaceAll("\\s", "\\t"); //meter t omde tem espaco
        System.out.println(r);
        String url = "www.xti.com.br/clientes-2011.html";
        String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
        boolean b = url.matches(re);
        System.out.println(b); 
        re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).com";
        r=url.replaceAll(re, "http://$1/$3/$2.jsp");
        System.out.println(r);
        System.out.println(url);
    }

}
