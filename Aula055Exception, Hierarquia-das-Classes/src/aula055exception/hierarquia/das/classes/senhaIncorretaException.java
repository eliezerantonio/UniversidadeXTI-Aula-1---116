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
public class senhaIncorretaException extends Exception {

    senhaIncorretaException(String mensagem) {
        super(mensagem);
    }

}
