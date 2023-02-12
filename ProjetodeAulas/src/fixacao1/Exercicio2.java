/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fixacao1;

import java.util.Scanner;

/**
 *
 * @author cg3023788
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int anos, mes, dias, idade_atual;
	
            System.out.println("Informe o dia em que voce nasceu: ");
            dias = sc.nextInt();
                
            System.out.println("Informe o mes em que voce nasceu: ");
            mes = sc.nextInt();
            
                
            System.out.println("Informe o ano em que voce nasceu: ");
            anos = sc.nextInt();
            
            
            mes = mes *30;
            anos = anos * 365;
            
            idade_atual = dias + mes + anos;
            
            System.out.println("Voce tem: %d dias "+ idade_atual );

           

            


        }
    
}
}

