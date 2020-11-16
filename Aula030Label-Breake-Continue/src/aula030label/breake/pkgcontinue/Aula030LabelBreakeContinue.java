package aula030label.breake.pkgcontinue;

/**
 *
 * @author eliezer
 */
public class Aula030LabelBreakeContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("Entrou");
            break;
        }

        String texto = " ";

        for (int i = 0; i < 9; i++) {
            if (i == 5) {
               
                break; //para o loop
                //continue salta simplesmente o 5

            }
             System.out.print(i);

        }
        System.out.println("");
        System.out.println("exemplo de rotulo");

        boolean matriz[][] = {{true, false, false, true, false}, {false, false, false, false}};
        busca:// rotulo 
        for (int a = 0; a < matriz.length; a++) {
            System.out.print("A ");
            for (int b = 0; b < matriz[a].length; b++) {
                System.out.print("B ");

                if (matriz[a][b]) {
                    System.out.print("True ");
                    break busca;
                }
            }

        }

    }

}
