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
public class Exe01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        double custoF , calc, preco;
        
        System.out.println("Informe o custo da fabrica: ");
        custoF = sc.nextDouble();
        
        calc = custoF * 0.73;
        
        preco = calc + custoF;
        
        System.out.println("O valor para o consumidor é de: " + preco);
        
        
    }
}
