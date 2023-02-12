/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fixacao05;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cg3023788
 */
public class Exe01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String vetor[] = new String[5];

        String nome[] = new String[5];
        String animal[] = new String[5];
        String cor_olhos[] = new String[5];
        String z;
        int idade[] = new int[5];
        int cg[] = new int[5];
        //// int f = 0;

        for (int i = 0; i < 6 ; i++) {
            System.out.println("Informe seu nome: ");
            nome[i] = sc.nextLine();
            vetor[0] = nome[i];

            System.out.println("Informe sua idade: ");
            idade[i] = sc.nextInt();
            z = Integer.toString(idade[i]);
            vetor[1] = z;


            System.out.println("Informe o seu animal favorito: ");
            animal[i] = sc.next();
            sc.nextLine();
            vetor[2] = animal[i];
            
            System.out.println("Informe seu cg: ");
            cg[i] = sc.nextInt();
            z = Integer.toString(cg[i]);
            vetor[3] = z;
            
            System.out.println("Informe a cor dos seus olho: ");
            cor_olhos[i] = sc.next();
            sc.nextLine();
            vetor[4] = cor_olhos[i];
        }
        for (int cc = 0 ; cc < 6 ; cc++){
            System.out.println( " Nome: " + nome[cc] + "\t Idade: "+ idade[cc] +  "\t Animal Favorito: " + animal[cc] + "\t Cg: " + cg[cc]  +
            "\t Cor dos olhos: " + cor_olhos[cc]);
        }
    }

}
