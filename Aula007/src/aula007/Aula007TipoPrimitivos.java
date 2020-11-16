/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula007;

/**
 *
 * @author eliezer
 */
public class Aula007TipoPrimitivos{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int idade=31; //32 bit
      double preco= 12.22;//64 bit
      char sexo ='M';//16 bit de informacao 
      boolean casado= true;//1bit
      
      byte b= 127; // apenas 127
      short s= 32_767;//32 mil
      int i=2_000_000_000; // 2bilhões
      long l= 9_000_000_000_000_000_000L;
      double d=1.77;
      float f=123F;
    
      
      i=(int)l;   //conversao implicita
        System.out.println(i);
        
      
    }
    
}
