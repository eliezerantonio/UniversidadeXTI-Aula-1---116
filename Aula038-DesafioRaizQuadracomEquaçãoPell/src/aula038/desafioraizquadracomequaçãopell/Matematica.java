/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula038.desafioraizquadracomequaçãopell;

/**
 *
 * @author eliezer
 */
public class Matematica {

    int raiz(int numero) {
        int raiz = 0;
        int impar = 1;

        while (numero >= impar) {
            numero = numero - impar;
            impar = impar + 2;
            raiz++;

        }

        return raiz;

    }

}
