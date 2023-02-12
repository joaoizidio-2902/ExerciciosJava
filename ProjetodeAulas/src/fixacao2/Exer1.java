/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fixacao2;
import java.util.Scanner;
/**
 *
 * @author cg3023788
 */
public class Exer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float vl;

            System.out.println("Entre com o valor do kg de ouro:");
            vl = sc.nextFloat();

            System.out.printf("5 g: R$ %.2f%n", vl * 0.005 );
            System.out.printf("10 g: R$ %.2f%n", vl * 0.01 );
            System.out.printf("20 g: R$ %.2f", vl * 0.02 );
        }

    }
    
}
