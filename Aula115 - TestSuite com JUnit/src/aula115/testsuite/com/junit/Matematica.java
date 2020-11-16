/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula115.testsuite.com.junit;

/**
 *
 * @author eliezer
 */
public class Matematica {

    double media(double x, double y) {
        System.out.println("media(double x, double y)");
        return (x + y) / 2;
    }

    double media(String x, String y) {
        System.out.println("media(String x, String y)");
        double xi = Double.parseDouble(x);
        double yi = Double.parseDouble(y);

        return (xi + yi) / 2;

    }

    double media(double... numero) {
        double total = 0;
        System.out.println("double... numero");
        for (double n : numero) {
            total += n;
        }

        return total;

    }

    double med(double... numero) {
        double total = 0;

        for (double n : numero) {
            total += n;
        }

        return total;

    }

}
