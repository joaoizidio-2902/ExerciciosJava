/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fixacao2;
import java.util.Scanner;
/**
 *
 * @author cg3023788
 */
public class Exer5 {
    public static int Resto(int a, int b) {
        return a % b;
    }   
    public static int Trunca(double d) {
        return (int) d;
    }
    public static int Quociente(int a, int b) 
    {
            
        return a / b;
    }
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner (System.in)){
        
            int mes, dia, ano, s, diaSemana, a;
            
            System.out.println("DIA: ");
            dia = sc.nextInt();
            
            System.out.println("MES: ");
            mes = sc.nextInt();
            
            System.out.println("ANO: ");
            ano = sc.nextInt();
            
            a = (ano % 100);
            s = (ano / 100);
            
            if (mes < 3)
            {
                mes = mes + 10;
                a = a - 1;
            }
            else
                mes = mes - 2;
            
                
            diaSemana = Resto ((Trunca(2.6 * mes - 0.1) + dia + a + Quociente(a, 4 ) + Quociente(s, 4) - 2 * s), 7);
        
            
            
            switch (diaSemana)
            {
                case 0:
                    diaSemana = 0;
                    System.out.println("\nDomingo");
                break;
                case 1: 
                    diaSemana = 1;
                    System.out.println ("\nSegunda-Feira");
                break;
                case 2:
                        diaSemana = 2;
                        System.out.println ("\nTerca-Feira");
                break;
                case 3:
                        diaSemana = 3;
                        System.out.println ("\nQuarta-Feira");
                break;
                case 4:
                        diaSemana = 4;
                        System.out.println ("\nQuinta-Feira");	
                break;
                case 5:
                        diaSemana = 5;
                       System.out.println ("\nSexta-Feira");	
                break;
                case 7:
                        diaSemana = 6;
                        System.out.println ("\nSabado");		
                break;
            }
        }
    }
}