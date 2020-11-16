/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula018operadoresespeciais;

/**
 *
 * @author eliezer
 */
public class Aula018OperadoresEspeciais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade = 18;
        String x = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(x);

        System.out.println("----------------------------------");
        //Diâmetro :2r
        double raio = 10;
        double diametro = 2 * raio;
        System.out.println(diametro);

        System.out.println("");
        //Cincunferencia: 2Pi r

        double pi = Math.PI;
        double circunferencia = 2 * pi * raio;
        System.out.println(circunferencia);

        //area Pi r2
        double area = pi * (raio * raio);
        System.out.println(area);
    }

}
