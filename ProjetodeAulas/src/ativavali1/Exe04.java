/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ativavali1;

import java.util.Scanner;

/**
 *
 * @author cg3023788
 */
public class Exe04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        int vetor[] = new int[30];
        int calc = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o numero " + i + " : ");
            vetor[i] = sc.nextInt();

        }
         System.out.println("Informe um ultimo numero: ");
            num = sc.nextInt();
        
        for (int c = 0; c < vetor.length; c++){
        if (vetor[c] == num){
            calc += 1;
        }
        } 
        System.out.println("Apareceu " + calc);
    }
}
