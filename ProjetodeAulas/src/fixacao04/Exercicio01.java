package fixacao04;

import java.util.Scanner;
/**
 *
 * @author cg3023788
 */
public class Exercicio01 {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        int x;
        
        System.out.println("Digite um valor inteiro: ");
         x = sc.nextInt();

         int metade = x / 2, y = 1, soma = 0;
         while (y <= metade ){
             if (x%y == 0){
                 soma = soma + y;
             }
            y++;
         } 

        if (soma == x) System.out.println("O número " +x+ " é perfeito");
        
        else
            System.out.println("O número " +x+ " não é perfeito");
    
        }        
    }
