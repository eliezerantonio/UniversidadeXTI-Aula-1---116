package aula025desafiodosdados;

import java.util.Random;
import java.util.Scanner;

public class Aula025DesafiodosDados {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Qual é o seu Palpite");
        int palpite = new Scanner(System.in).nextInt();
        int dado = r.nextInt(6) + 1;

        System.out.println("Palpite : " + palpite);
        System.out.println("Dado: " + dado);

        String sms = palpite == dado ? "VC ACERTOU" : "VC ERROU";
        System.out.println(sms);
    }

}
