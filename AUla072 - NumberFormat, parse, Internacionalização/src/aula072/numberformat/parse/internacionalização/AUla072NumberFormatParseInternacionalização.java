/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula072.numberformat.parse.internacionalização;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author eliezer
 */
public class AUla072NumberFormatParseInternacionalização {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        double saldo = 123_356.189;
        NumberFormat f = NumberFormat.getInstance();
        
        System.out.println(f.format(saldo));//genericos
        f = NumberFormat.getIntegerInstance();
        System.out.println(f.format(saldo));//inteiros

        f = NumberFormat.getPercentInstance();
        System.out.println(f.format(saldo));//percentual

        f = NumberFormat.getCurrencyInstance();
        System.out.println(f.format(saldo));
        f.setMaximumFractionDigits(3);
        System.out.println(f.format(saldo));

        /*Intenacionalizacao*/
        f = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(f.format(saldo));
        f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(f.format(saldo));
        /*Conversao*/
        f = NumberFormat.getCurrencyInstance();
        System.out.println(f.parse("R$ 1.100,25"));
    }
    
}
