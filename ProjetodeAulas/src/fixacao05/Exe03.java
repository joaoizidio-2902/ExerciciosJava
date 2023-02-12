/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fixacao05;

import java.util.Scanner;
import java.util.Arrays; 

public class Exe03{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
int[] numa= {0,1,5,8,3,9};
        int[] numb = {0,8,6,2,0,7};
        int result[] = new int[6], verificacao=0;
        
        for(int i=5;i>=0; i--){
            result[i]= numa[i]+numb[i];
            
            if(verificacao==1){
                result[i] +=1;
            }
            
            if(result[i] >= 10){
                result[i] = result[i]-10;
                verificacao=1;
            }else {
                verificacao=0;
            }
        }
        
        for(int i=0; i<3;i++){
            switch(i){
                case 0:
                    System.out.printf("\nV[1]=\t");
                    int a=0;
                    while(a<numa.length){
                        System.out.printf("%d\t", numa[a]);
                        a++;
                    }
                    break;
                case 1:
                    System.out.printf("\nV[2]=\t");
                    int b=0;
                    while(b<numa.length){
                        System.out.printf("%d\t", numb[b]);
                        b++;
                    }
                    break;
                case 2:
                    System.out.printf("\n\nV[3]=\t");
                    int c=0;
                    while(c<numa.length){
                        System.out.printf("%d\t", result[c]);
                        c++;
                    }
                    break;
            }
        }
    }
}