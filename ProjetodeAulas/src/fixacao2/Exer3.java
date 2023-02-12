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
public class Exer3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num, cen,dez,uni;
            
            System.out.println("Informe um numero: ");
            num = sc.nextInt();

            cen = num / 100;
            num = num - (cen * 100);
            
            dez = num / 10;
            num = num - (dez * 10);
            
            uni = num / 1;
      

            System.out.printf("%d%d%d", num, dez, cen, uni);
        }

    }
}