package fixacao1;

import java.util.Scanner;

/**
 *
 * @author cg3023788
 */

public class Exercicio6{

 public static void main(String [] args) {
    try (Scanner sc = new Scanner(System.in)){
        float conta, calc;
        
        System.out.println("Informe o valor da conta: ");
        conta = sc.nextFloat();

        System.out.println("IMPORTANTE! EXISTE UMA TAXA FIXA DE SERVIÇO DO GARÇOM DE 10% DO VALOR FINAL DA CONTA.");
        
        calc = conta * 10 / 100;

        conta = conta + calc;

        System.out.println("O valor total a ser pago é de " + conta +" reais");




    }
 }



}