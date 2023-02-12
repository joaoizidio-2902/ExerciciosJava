package fixaca03;

import java.util.Scanner;
/**
 *
 * @author cg3023788
 */
public class Exe2 {
    public static void main(String [] args) {
        
    Scanner sc = new Scanner(System.in);
    
    float x, y ,z;

    System.out.println("Informe o comprimento x do triangulo: ");
    x = sc.nextFloat();

    System.out.println("Informe o comprimento y do triangulo: ");
    y = sc.nextFloat();

    System.out.println("Informe o comprimento z do triangulo: ");
    z = sc.nextFloat();
    
    if (x + y > z || x + z > y || y + z > x)
    {
        if (x == y && x == z && y == z)
        System.out.println ("Trinagulo equilatero");
        
        else if (x == y && y != z)
        System.out.println ("Triangulo isosceles / Triangulo equilatero");
        
        else if (x != y && y != z)
            System.out.println ("Triangulo escaleno");
    }
    else
        System.out.println("Nao forma um triangulo");

}
}
