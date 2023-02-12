package fixacao1; 

import java.util.Scanner;

/**
 *
 * @author cg3023788
 */

 public class Exercicio5 {

    public static void main(String [] args) {
        try (Scanner sc = new Scanner(System.in)) {
        
            float premio, sena, quina, quadra;

            System.out.println("Informe a premiação da Mega sena: ");
            premio = sc.nextFloat();

            sena = premio * 60 / 100;
            quina = premio * 30 / 100;
            quadra = premio * 10 / 100;

            System.out.println("O ganhador da mega sena recebe " + sena + " reais. O ganhador da quina recebe " + quina + " reais. O ganhador da quadra recebe " + quadra + " reais." );
        }
        
    }
 

}