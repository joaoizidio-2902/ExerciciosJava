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
public class Exer2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;

            System.out.println("Informe um numero: ");
            num = sc.nextInt();

            System.out.printf("Antecessor: %d%n", num - 1);
            System.out.printf("Sucessor: %d%n", num + 1);
        }
    }
}