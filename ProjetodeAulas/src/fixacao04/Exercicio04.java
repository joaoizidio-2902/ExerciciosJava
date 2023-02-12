package fixacao04;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author cg3023788
 */

    public class Exercicio04{

    /**
     * @param args
     */
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        Random r = new Random();
        int num,
        sorteado = 0,
        tentativas=0;

        System.out.println("Informe um numero de 1 a 99: ");
        num = sc.nextInt();

        
        if (num < 99 && num > 1){     
            do{
                sorteado = r.nextInt(99) + 1;
                tentativas ++;
           
            
            }while (sorteado != num);
                System.out.println("Acertouu :) O numero de tentativas foi de: " + tentativas);
        }
        else{ System.out.println("Numero invalido!");
            }
    
    }
         





}

