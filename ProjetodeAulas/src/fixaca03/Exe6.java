package fixaca03;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author cg3023788
 */

public class Exe6 {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        Random gera = new Random ();
        int jogador,computador;
	
        System.out.println("---------------JokenPo---------------\n\n");
        System.out.println ("\nVamos iniciar o jogo...\n");
        System.out.println("1. PEDRA\n");
        System.out.println("2. PAPEL\n");
        System.out.println("3. TESOURA\n");
        
        System.out.println("Escolha o que jogar: ");
        jogador = sc.nextInt();
        
        switch(jogador)
        {
            case 1:
                System.out.println("Jogador escolheu PEDRA\n");
            break;
            
            case 2:
                System.out.println("Jogador escolheu PAPEL\n");
            break;
            
            case 3:
                System.out.println("Jogador escolheu TESOURA\n");
            break;
            
            default:
                System.out.println("Opcao invalida\n");
        }	
        
        
        computador = (1 + gera.nextInt(3));
        switch(computador)
        {
            case 1:
                System.out.println("Computador escolheu PEDRA\n");
            break;
            
            case 2:
                System.out.println("Computador escolheu PAPEL\n");
            break;
            
            case 3:
                System.out.println("Computador escolheu TESOURA\n");
            break;		
        }
        if(jogador==computador)
            {
            System.out.println("EMPATE\n");
            }
            else if ((jogador==1 && computador==3) || (jogador==2 && computador==1) || (jogador==3 && computador==2))
            {
                System.out.println("JOGADOR VENCEU\n");
            }
        else
            {
                System.out.println("COMPUTADOR VENCEU\n");
            }
    
    }
    }

