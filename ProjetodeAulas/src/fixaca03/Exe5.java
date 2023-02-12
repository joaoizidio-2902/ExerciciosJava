package fixaca03;
import java.util.Scanner;
/**
 *
 * @author cg3023788
 */

public class Exe5 {
    
    public static void main(String [] args) {
    Scanner sc = new Scanner (System.in);
        
    int x, x2;

        System.out.println ("Informe um numero: ");
        x = sc.nextInt(); 

        System.out.println ("Informe o segundo numero: ");
        x2 = sc.nextInt();

        System.out.println ("Escolha a calculadora entre:");

        System.out.println (" \n+ Soma \t - Subtracao \n * Multiplicacao \t / Divisao\n ");
        char oper = sc.next().charAt(0); 

     
    
    switch (oper){
	case '+':
    System.out.printf ("%d + %d = %d", x, x2, x + x2);
		break;
	case '-':
    System.out.printf ("%d - %d = %d", x, x2, x - x2);
		break;
		
	case '*':
    System.out.printf ("%d * %d = %d", x, x2, x * x2);
		break;	
	
	case '/':
    System.out.printf ("%d / %d = %d", x, x2, x / x2);
		break;
		
	default: System.out.println ("Opcao invalida");
}
}
}

    
