package fixaca03;
import java.util.Scanner;
/**
 *
 * @author cg3023788
 */

public class Exe4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
    
    
        float n, n2, n3, mp;

        System.out.println("Informe a nota 1: ");
        n = sc.nextFloat();

        System.out.println("Informe a nota 2: ");
        n2 = sc.nextFloat();

        System.out.println("Informe a nota 3: ");
        n3 = sc.nextFloat();


        mp = ((n * 2) + (n2 * 5) + (n3 * 3)) / 10;
        
        if (mp >= 0 && mp <= 4)
            System.out.println("Reprovado");
        else if (mp >= 4 && mp < 7)
            System.out.println("Exame final");
        else if (mp >= 7 && mp <= 10)
            System.out.println("Aprovado");
    

    }  
}
