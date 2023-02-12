/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fixacao05;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author cg3023788
 */
public class Exe02 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String vetor[] = new String[10];

        int dt_jogo[] = new int[10];
        int Score_m[] = new int[10];
        int Score_v[] = new int[10];
        int resultado[] = new int[10];
        String local[] = new String[10];
        String T_mandande[] = new String[10];
        String T_visitante[] = new String[10];
        String z;

        for (int n = 1; n < 11; n++) {
            for (int i = 0; i < 10; i++) {

                System.out.print("Informe a data do jogo " + (i+1) + ": [dd mm aaaa]");
                dt_jogo[i] = entrada.nextInt();
                z = Integer.toString(dt_jogo[i]);
                vetor[0] = z;

                System.out.print("Informe o local do jogo " + (i+1) + ": ");
                local[i] = entrada.next();
                entrada.nextLine();
                vetor[1] = local[i];

                System.out.print("Time mandante: ");
                T_mandande[i] = entrada.nextLine();
                vetor[2] = T_mandande[i];

                System.out.print("Time visitante: ");
                T_visitante[i] = entrada.nextLine();
                vetor[3] = T_visitante[i];

                System.out.println("Informe o score do mandante: ");
                Score_m[i] = entrada.nextInt();
                vetor[4] = Integer.toString(Score_m[i]);
                

                System.out.println("Informe o score do visitante: ");
                Score_v[i] = entrada.nextInt();
                vetor[5] = Integer.toString(Score_v[i]);
                 

            }

            for (int vc =0; vc < 10; vc++) {
                System.out.println("Partida " + (vc));

                if (Score_m[vc] > Score_v[vc]) {
                    resultado[vc] = Score_m[vc];
                    System.out.println("Vencedor: " + T_mandande[vc]);
                } 
                else if (Score_v[vc] > Score_m[vc]) {
                    resultado[vc] = Score_v[vc];
                    System.out.println("Vencedor: " + T_visitante[vc]);
                } else {
                    System.out.println("Empate");
                }

            }
        }
    }
}
