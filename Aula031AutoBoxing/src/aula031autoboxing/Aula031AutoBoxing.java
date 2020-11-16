/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula031autoboxing;

/**
 *
 * @author eliezer
 */
public class Aula031AutoBoxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Antigamento no java 5
        Integer x = new Integer(555);//Enpacotando
        int a =x.intValue();//desempacontando
        a++;//incrementando
        x= new Integer(a); //enpacota novamente 
        System.out.println(x.intValue()); //mostrar
        //agora
        Integer b=555;
        b++;//desempacota, incremnete e reempacota
        System.out.println(b);
        
        System.out.println("COm String ");
        
        Boolean v = new Boolean ("true");
        if(v.booleanValue()){
            System.out.println(v);
            
        }
        
        
        
        
    }

}
