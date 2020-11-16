/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula069.date.calendar.get.set.clear.add.e.roll;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author eliezer
 */
public class Aula069DateCalendarGetSetClearAddERoll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* comeca 1 de janeiro de 1970*/

        System.out.println(System.currentTimeMillis());// deste a data acima ate agora

        System.out.println(new Date());// retornado a data actual
        Date agora = new Date();
        System.out.println(agora); //mesmo de cima mas com objecto

        Date data = new Date(1_000_000_000_000L);
        System.out.println(data);

        //Metodos
        data.getTime(); //tempo em segundos 
        data.setTime(1_000_000_000_000L);

        System.out.println(data.compareTo(agora));//-1,0,1 
        /*Gegorian calendar*/
        Calendar c = Calendar.getInstance();/*==*/ new GregorianCalendar();
        c.set(1997, Calendar.SEPTEMBER, 8);

        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        c.set(Calendar.YEAR, 1992);
        c.set(Calendar.MONTH, 11);
        c.set(Calendar.DAY_OF_MONTH, 25);

        System.out.println(c.getTime());
        /*limpando */
        c.clear(Calendar.MINUTE);
        c.clear(Calendar.SECOND);
        System.out.println(c.getTime());
        /*Add*/
        c.add(Calendar.DAY_OF_MONTH, 1);//tambem podemos subtrair
        c.add(Calendar.YEAR, 1);
        System.out.println(c.getTime());

        /*add e roll*/
 /*add*/
        c.add(Calendar.MONTH, 20);//tambem podemos subtrair

        System.out.println(c.getTime());
        /*roll*/
        c.roll(Calendar.MONTH, 20);//tambem podemos subtrair

        System.out.println(c.getTime());
        Calendar c2 = Calendar.getInstance();
        int hora = c2.get(Calendar.HOUR_OF_DAY);
        if (hora<12){
            System.out.println("Bom dia");
        }
        else if(hora>=12){
            System.out.println("Boa tarde");
            
        }
        else{
            System.out.println("Boa noite");
        }

    }
}
