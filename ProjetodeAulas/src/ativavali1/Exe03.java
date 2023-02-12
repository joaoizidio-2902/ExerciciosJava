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
public class Exe03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int codigo[] = new int[15];
        int vetor[] = new int[15];
        int preco[] = new int[15];
        int media = 0;
        int valorT = 0;
        int quantd[] = new int[16];
        int mercad = 0;
        int m, aux = 0;
        int maior = 0, menor = 0;

        
            for (int c = 1; c <=preco.length; c++) {

                    System.out.println("Informe o código do produto " + c + ": ");
                    codigo[c] = sc.nextInt();

                   
                        System.out.println("Informe o preço do produto " + c + ": ");
                        preco[c] = sc.nextInt();
                        
                           
                                System.out.println("Informe a quantidade em estoque do produto " + c + ": ");
                                quantd[c] = sc.nextInt();

                            
                            mercad += quantd[c] * preco[c];
                            //maior preço
                            if (preco[c] > maior) {
                                maior = preco[c];
                            }else if (preco[c] < menor) {
                                menor = preco[c];
                            }
                            aux = maior - menor;
                        
                       
                    
                }
            for (int v = 1; v <= preco.length; v++){
                media += preco[v];
            }
            media /= preco.length;
            
            System.out.println("O maior preço lidor foi: " + maior);
            System.out.println("A media dos preços é de: " + media);
            System.out.println("O total de mercadorias em estoque é: " + mercad);
        
    }
}
