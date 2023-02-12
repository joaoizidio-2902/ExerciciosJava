package fixaca03;

import java.util.Scanner;
/**
 *
 * @author cg3023788
 */
public class Exe3 {
    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);   
        int x, y, z;

        System.out.println("Informe o primeiro número: ");
        x = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        y = sc.nextInt();

        System.out.println("Informe o terceiro número: ");
        z = sc.nextInt();

        if (z > x)
        {
          if (x > y)
        {
          System.out.printf("A ordem crescente: %d %d %d\n", y, x, z);
        }
          else 
        {
          if (y < z)
            {
            System.out.printf("A ordem crescente: %d %d %d\n", x, y, z);
            }
        }
        }
      
      if (x > y)
        {
          if (y > z)
        {
            System.out.printf("A ordem crescente: %d %d %d\n", z, y, x);
        }
          else 
        {
          if (z < x)
            {
            System.out.printf("A ordem crescente: %d %d %d\n", y, z, x);
            }
        }
        }
      
      if (x < y)
        {
          if (z < x)
        {
        System.out.printf("A ordem crescente: %d %d %d\n", z, x, y);
        }
          else 
        {
          if (z < y)
            {
                System.out.printf("A ordem crescente: %d %d %d\n", x, z, y);
            }
        }
        }
    }
}

    
        
    
 

