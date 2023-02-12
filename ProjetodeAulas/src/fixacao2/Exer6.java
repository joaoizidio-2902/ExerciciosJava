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
public class Exer6 
{
    
    public static float imc(float peso, float alt) 
    {
        return peso / (alt * alt);
    }
    public static void tabela() {
        System.out.println("Condição    Mulheres    Homens");
        System.out.println("------------------------------");
        
        System.out.println("Abaixo do peso  < 19.1   < 20.7");
        System.out.println("peso normal   19.1 - 25.8   20.7 - 26.4");
        System.out.println("acima do peso  25.8 - 32.3    26.4 - 31.1");
        System.out.println("obeso       > 32.3      > 31.1");
        System.out.println("------------------------------");
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float peso, alt;

            System.out.println("Informe seu peso [kg]? ");
            peso = sc.nextFloat();

            System.out.println("Informe sua altura [m]? ");
            alt = sc.nextFloat();

            System.out.printf("IMC = %.2f \n", imc(peso, alt));
        }
        tabela();


                
    }
}