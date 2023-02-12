/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fixaca03;
import java.util.Scanner;
/**
 *
 * @author cg3023788
 */
public class Exe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        
    Scanner sc = new Scanner(System.in);
        int  dd, mm, yyyy;

        System.out.println("Informe um dia: ");
        dd = sc.nextInt();

        System.out.println("Informe um mês: ");
        mm = sc.nextInt();

        System.out.println("Informe um ano: ");
        yyyy = sc.nextInt();
        
        if (yyyy >= 1900 && yyyy <= 9999)
        {
	        if (mm >= 1 && mm <= 12)
	        {
		        if ((dd >= 1 && dd <= 31) && (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12))
		        System.out.println ("\nData Valida");
		
                else if ((dd >= 1 && dd <= 30) && (mm == 4 || mm == 6 || mm == 9 || mm == 11))
		            System.out.println ("\nData Valida");
		
                else if ((dd >= 1 && dd <= 28) && (mm == 2))
                    System.out.println ("\nData Valida");
		
                    else if ((dd == 29 && mm == 2 && (yyyy % 400 == 0 || (yyyy % 4 == 0 && yyyy % 100 != 0))))
                        System.out.println("\nData valida");
		
                else
                    System.out.println("\nDia invalido");
	
	        }
	else
		{ System.out.println("\nMes invalido");
		}	
        }
else{
	System.out.println("\nAno invalido");
	}
    }
}
