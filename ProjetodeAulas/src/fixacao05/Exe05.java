/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fixacao05;

/**
 *
 * @author cg3023788
 */
public class Exe05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[][] = {
            {1,2,3},
            {2,10,2},
            {3,2,1},    
        };
        int ref=1;
        
        for(int i = 0; i<vetor.length;i++){
            for(int j=0; j<vetor[i].length;j++){
                if(vetor[i][j]==vetor[j][i]){
                    ref *=1;
                }else{
                    ref *=0;
                }
            }
        }
         
        if(ref==1){
            System.out.println("sim");
        }else System.out.println("nao");
    }
    
}
