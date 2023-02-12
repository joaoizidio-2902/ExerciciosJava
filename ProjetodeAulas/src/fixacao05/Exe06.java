/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fixacao05;

/**
 *
 * @author cg3023788
 */
public class Exe06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int vetor[][] = {
            {2, -1, 5},
            {7, 3, 10},
            {-5, 1, 2},};
        int maior = -100000, linha = 0, menor = 100000;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[i].length; j++) {
                if (vetor[i][j] >= maior) {
                    linha = i;
                    maior = vetor[i][j];
                }
            }
        }
        
        for (int i = 0; i < vetor[linha].length; i++){
            if (vetor[linha][i] <= maior){
                maior = vetor[linha][i];
                menor = maior;
            }
        }
        
        System.out.printf("Linha: \t%d\nMINIMAX: %d\n", linha, menor);
    }
}
