/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula102annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import javax.lang.model.element.Element;

/**
 *
 * @author eliezer
 */
@Target(ElementType.TYPE)
@Documented
public @interface Cabecalho {

    String instituicao();

    String projecto();

    String dataCriacao();

    String criador();

    int revisao() default 1;

}
