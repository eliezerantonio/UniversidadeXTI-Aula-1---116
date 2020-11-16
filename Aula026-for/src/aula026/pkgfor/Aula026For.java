
package aula026.pkgfor;


public class Aula026For {

    public static void main(String[] args) {
        String texto = "";
        for (int i = 0; i <= 10; i++) {

            if (i % 2 == 0) {
                texto += i + ",";

            }

        }
        System.out.println(texto);

    }

}
