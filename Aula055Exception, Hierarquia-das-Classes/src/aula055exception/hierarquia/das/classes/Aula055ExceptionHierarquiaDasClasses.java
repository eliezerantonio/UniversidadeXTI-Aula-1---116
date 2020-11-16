/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula055exception.hierarquia.das.classes;

/**
 *
 * @author eliezer
 */
public class Aula055ExceptionHierarquiaDasClasses {

    public static void autenticar(String senha) throws senhaIncorretaException {

        if ("123".equals(senha)) {
            System.out.println("Autenticado com sucesso");
        } else {

            throw new senhaIncorretaException("Senha Invalida");

        }

    }

    public static void main(String[] args) {

        try {
            autenticar("nada");
        } catch (senhaIncorretaException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
