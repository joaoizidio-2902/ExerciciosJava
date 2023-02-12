package fixacao1;

import java.util.Scanner;

/**
 *
 * @author cg3023788
 */
public class Exercicio4 {

        /**
        *@param args the command line arguments
        */
        public static void main(String [] args) {
            try (Scanner sc = new Scanner(System.in)) {
                float vl1, vl2, qt1, qt2,vt,form, ipi;
                 
                
                System.out.println("Informe a quantidade de peças 1: ");
                qt1 = sc.nextFloat();

                System.out.println("Informe a quantidade de peças 2: ");
                qt2 = sc.nextFloat();

                System.out.println("Informe o valor das peças 1: ");
                vl1 = sc.nextFloat();

                System.out.println("Informe o valor das peças 2: ");
                vl2 = sc.nextInt();
                
                System.out.println("Informe o valor do IPI a ser acrescentado: ");
                ipi = sc.nextFloat();
                
                ipi = ipi / 100 + 1;
                 
                form = vl1 * qt1 + vl2 * qt2;
                
                vt = ipi * form;
                System.out.println("O valor total a ser pago é: " + vt);  

            }

        }
}