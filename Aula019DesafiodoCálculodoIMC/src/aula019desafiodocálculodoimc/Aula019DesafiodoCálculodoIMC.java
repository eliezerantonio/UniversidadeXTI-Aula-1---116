/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula019desafiodocálculodoimc;

import javax.swing.JOptionPane;

/**
 *
 * @author eliezer
 */
public class Aula019DesafiodoCálculodoIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double pesoEmQuilogramas = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
        double alturaEmMetros = Double.parseDouble(JOptionPane.showInputDialog("Digte a aultura"));
        double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);

        String sms = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Peso nao ideal";

        System.out.println("Peso: " + imc);
        System.out.println(sms);

        JOptionPane.showMessageDialog(null, "O Peso é: " + imc + "\n" + sms);
    }

}
