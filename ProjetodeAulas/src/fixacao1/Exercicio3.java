package fixacao1;

import java.util.Scanner;

/**
 *
 * @author cg3023788
 */

public class Exercicio3 {
        /**
        *@param args the command line arguments
        */
        public static void main(String [] args) {
            try (Scanner sc = new Scanner(System.in)) {
            int m_a, m_b;
            float dista;
          
                System.out.println("Informe as Quilometragens em ordem DECRESCENTE) ");
                System.out.println("Informe o Marco A: "); 
          
                m_a = sc.nextInt();
            
                System.out.println("Informe o Marco B:"); 
                m_b = sc.nextInt();
          
                dista = m_a - m_b;
                System.out.println("A distancia entre os marco A e B e de: " + dista); 
          
          
                System.out.println("O tempo decorrido em 40 km/h foi de: " + dista / 40);
                System.out.println("O tempo decorrido em 50 km/h foi de: " + dista / 50);		
                System.out.println("O tempo decorrido em 60 km/h foi de: " + dista / 60);
                System.out.println("O tempo decorrido em 70 km/h foi de: " + dista / 70);
                System.out.println("O tempo decorrido em 80 km/h foi de: " + dista / 80);
            }     
        }
    }
