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
public class Exe02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Scanner sc = new Scanner (System.in);
       
       String timeM, timeV ;
       int ScoreM;
       int ScoreV;
   
;
       
        System.out.println("Informe o time mandante: ");
        timeM = sc.nextLine();
        
        System.out.println("Informe o time visitante: ");
        timeV = sc.nextLine();
        
        System.out.println("Gol/s do time mandante: ");
        ScoreM = sc.nextInt(); 
        
        System.out.println("Gol/s do time visitante: ");
        ScoreV = sc.nextInt();
       
        if (ScoreM > ScoreV){
            System.out.println("Vencedor do jogo foi: " + timeM);
        }
        else if (ScoreV > ScoreM){
            System.out.println("Vencedor do jogo foi: " + timeV);
        }
        else{
            System.out.println("EMPATE!");
        }
        
    }
}
