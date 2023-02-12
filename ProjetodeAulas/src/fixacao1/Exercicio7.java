package fixacao1;

import java.util.Scanner;

/**
 *
 * @author cg3023788
 */

 public class Exercicio7 {
    public static void main(String [] args) {
        try (Scanner sc = new Scanner (System.in)) {
        float prest,j,c,i,t;
            
        System.out.println("Informe o valor do imovel: ");
        c = sc.nextFloat();
        
        System.out.println("Informe a taxa de juros: ");
        i = sc.nextFloat();

        System.out.println("Por quantos anos voce deseja parcelar? ");
        t = sc.nextFloat();

        j = (c * i / 100) * t;

        prest = j / 12;

        System.out.println("O valor das prestações sera de: " + prest);

        
    
    }

    }
}
