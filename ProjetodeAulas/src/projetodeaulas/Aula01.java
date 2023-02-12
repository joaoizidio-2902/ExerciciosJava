/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package projetodeaulas;

import java.util.Scanner;

/**
 *
 * @author cg3023788
 */

public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int num = 10;
        System.out.println("Olá Mundo!");
        System.out.println(++num);
        System.out.println (num);
    }*/

    String nome;
    int idade;
    double valor;
try (//boolean bool;
    Scanner sc = new Scanner(System.in)) {
        System.out.println("Digite eseu nome: ");
        nome = sc.nextLine();
        
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        
        System.out.println("Digite seu salario: ");
        valor = sc.nextDouble();
    } 
    System.out.println("O funcionario " + nome + " tem " + idade + " anos e recebe um salario de " + valor + " reais" );
    }
}

