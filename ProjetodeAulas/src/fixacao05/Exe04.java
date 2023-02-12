package fixacao05;

import java.util.Scanner;

public class Exe04 {
   
    /**
     * @param args
     */
    public static void main(String[] args) {
       //Scanner entrada = new Scanner(System.in);
       int[] v1 = {99, 2, 3, 10, 6};
       int[] v2 = {10, 2, 3, 7, 1002};
       int vetor[] = new int[v2.length];
       int vetor2[] = new int[v2.length];
       int vetor3[] = new int[v2.length * 2];
       int vetor4[] = new int[7];
       int ref = 0, ref1 = 0, ind;

       for (int i = 0; i < v1.length; i++) {
           for (int j = 0; j < v2.length; j++) {
               if (v1[i] == v2[j]) {
                   ind = v2[j];
                   vetor[ref] = ind;
                   ref++;
               }
           }
       }

       ref = 0;
       ind = 0;
       for (int i = 0; i < vetor.length; i++) {
           if (vetor[i] != 0) {
               vetor[ref] = i + 1;
               ref++;
           }
       }

       for (int i = 0; i < vetor.length; i++) {
           if (vetor[i] == 0) {
               vetor2[ind] = i;
               ind++;
           }
       }

       ref = 0;
       for (int i = 0; i < vetor2.length; i++) {
           if (vetor2[i] != 0) {
               ind = vetor2[i];
               vetor2[ref] = v2[ind];
               ref++;
           }
       }

       for (int i = 0; i < v2.length; i++) {
           vetor3[i] = v1[i];
       }
       
       for (int i = 0; i < vetor2.length; i++) {
           if(vetor2[i]!=0){
               vetor3[i+5] = vetor2[i];
           }
       }

       for (int i = 0; i < vetor3.length; i++) {
           System.out.printf("%d ", vetor3[i]);
       }
    }
}


