package fixacao04;

/**
 *
 * @author cg3023788
 */
public class Exercicio02{
    public static void main(String [] args) {
        
        
        int primo=0;
      

        for (int i=5000; i<=7000; i++) {
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println(i);
            }
            primo = 0;
        }
    }
}
    
