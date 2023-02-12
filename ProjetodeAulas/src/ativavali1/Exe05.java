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
public class Exe05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        int matriz[][] = {{1, 2, 3, 4},
                          {1, 2, 3, 4},
                          {1, 2, 3, 4},
                          {1, 2, 3, 4},
                          {1, 2, 3, 4}};
        int indice;
        int soma = 0;

        System.out.println("Informe se quer linha ou coluna [1 / 2]?  ");
        escolha = sc.nextInt();

        System.out.println("Informe qual linha ou coluna para ser somada: ");
        indice = sc.nextInt();

        switch (escolha) {
            case 1:

                for (int i = 0; i < matriz[indice].length; i++) {
                    soma += matriz[indice][i];
                }
                
                break;
            case 2:
                for (int i = 0; i < matriz.length; i++) {
                    soma += matriz[i][indice];

                }
                break;
        }
        System.out.println("Calculo escolhido = " + soma);
    }

}
