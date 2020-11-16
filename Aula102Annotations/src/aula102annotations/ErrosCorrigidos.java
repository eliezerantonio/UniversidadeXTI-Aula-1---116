/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula102annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *
 * @author eliezer
 */

@Target({ElementType.TYPE,ElementType.METHOD})
public @interface ErrosCorrigidos {
    
    String [] erros();
 //   String [] values();
    
}
