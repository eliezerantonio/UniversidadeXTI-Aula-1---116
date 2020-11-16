
package aula012.entradagráficadedadoscomjoptionpane;

import javax.swing.JOptionPane;


public class Aula012EntradaGráficadeDadoscomJOptionPane {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual é o seu nome");
        JOptionPane.showMessageDialog(null, "o seu nome é: "+nome);
    }

}
