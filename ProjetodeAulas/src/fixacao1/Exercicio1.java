/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fixacao1;

import java.util.Scanner;

/**
 *
 * @author cg3023788
 */
public class Exercicio1 {

     /**
      * @param args the command line arguments
         */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float conv;
            float temp;
            System.out.println("Informe a temperatura em Fahrenheit: ");
            temp = sc.nextFloat();
            
            conv = (temp - 32) * 5 / 9  ;
            
            System.out.println("A temperatura em Celsius e: " + conv  );
        }
        }
    
}

