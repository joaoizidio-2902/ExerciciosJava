package exemplos;


import java.util.Scanner;



public class EX1 
{
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in)) 
        {
            int n1,
                n2,
                som;


            System.out.printf("%s%n%s%n", "Weelcome to Java", "Program"); //Utilizando o PRINTF
            System.out.println("Informe um numero de  \n0 - 10: ");
            System.out.print("Digite o primeiro numero: ");
            n1 = input.nextInt();
            
            System.out.print("Digite o segundo numero: ");
            n2 = input.nextInt();

            som = n1 + n2;
            System.out.printf("A soma é %d%n", som); 
        }
        

        
    }
   
    
}
