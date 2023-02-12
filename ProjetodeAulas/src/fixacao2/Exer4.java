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
public class Exer4 
{

    public static float soma(float a, float b ) 
    {
        return a + b;        
    }
    public static float subtracao(float a, float b) 
    {
        return a - b;
    }
    public static float multiplicacao(float a, float b) 
    {
        return a * b;   
    }
    public static float divisao(float a, float b) 
    {
        return a / b;    
    }
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            float a, b;

            System.out.println("Informe o primeiro numero: ");
            a = sc.nextFloat();

            System.out.println("Informe o segundo numero: ");
            b = sc.nextFloat();

            System.out.printf("%.1f + %.1f = %.1f%n",a,b, soma(a,b));
            System.out.printf("%.1f - %.1f = %.1f%n",a,b, subtracao(a,b));
            System.out.printf("%.1f * %.1f = %.1f%n",a,b, multiplicacao(a,b));
            System.out.printf("%.1f / %.1f =%.1f%n",a,b, divisao(a,b));
        }



    }
}
