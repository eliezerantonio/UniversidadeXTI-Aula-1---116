/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula102annotations;

import com.sun.xml.internal.ws.developer.Serialization;
import java.io.Serializable;

/*
*Instituicao:    Universidade XTI
*Pojecto:         sistema de avaliacao
* data de criaca :       08/10/2011
*Criador                      Eliezer
*Revisao:                      2
 */
@Cabecalho(
        instituicao = "XTI",
        projecto = "Sitema de avaliacao",
        dataCriacao = "23/01/2019",
        criador = "Eliezer",
        revisao = 2
)
@ErrosCorrigidos(erros = {"001", "002"})
//)@ErrosCorrigidos("011")
@SuppressWarnings("serial")
public class Anotacao implements Serializable {

    private int x;

    @Deprecated
    public void anotar() {

    }

    @Override
    public String toString() {
        return null;
    }
}
