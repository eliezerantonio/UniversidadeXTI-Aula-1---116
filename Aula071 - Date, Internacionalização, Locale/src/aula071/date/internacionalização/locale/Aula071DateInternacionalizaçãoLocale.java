/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula071.date.internacionalização.locale;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author eliezer
 */
public class Aula071DateInternacionalizaçãoLocale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
   LINGUA (ISO) 639
        
             Pais (ISO 3166)
         */
        Locale padrao = Locale.getDefault();
        Locale brasil = new Locale("pt", "BR");
        Locale india= new Locale("hi", "IN");
        Locale eua= Locale.US;
        Locale japao= Locale.JAPAN;
        System.out.println(brasil);
        System.out.println(padrao);

        Calendar c = Calendar.getInstance();
        c.set(2019, Calendar.FEBRUARY, 12);
        Date data = c.getTime();

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, eua);
        System.out.println(df.format(data));
    }

}
