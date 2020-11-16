/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg070.date.formatação.dateformat.format.e.parse;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author eliezer
 */
public class DateFormataçãoDateFormatFormatEParse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        c.set(1991, Calendar.FEBRUARY, 12);

        Date date = c.getTime();
        /*formatacao de datas*/
        DateFormat f = DateFormat.getDateInstance();
        System.out.println(f.format(date));

        /*Formatacao de time*/
        f = DateFormat.getTimeInstance();
        System.out.println(f.format(date));
        /*Formatacao de data e hora*/
        f = DateFormat.getDateTimeInstance();
        System.out.println(f.format(date));

        /*estilos*/
        System.out.println("_________________________________");
        System.out.println("estilo full");
        f = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(f.format(date));
        System.out.println("Estilo Long");
        f = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(f.format(date));
        System.out.println("Estilo Medium");
        f = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(f.format(date));
        System.out.println("Estilo SHOR");
        f = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(f.format(date));
        /*CONVERTENDO sTRING EM DATA*/
        Date date2 = f.parse("08-09-2018");
        System.out.println(date2);
        
        /*SimpleDateFormat*/
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        
        System.out.println(sdf.format(date));
        System.out.println(sdf.parse("10/10/2019"));
        
    }

}
