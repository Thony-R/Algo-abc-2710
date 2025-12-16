package ExerciceP1;
import java.util.Scanner;
import java.util.Random;

public class Exo3_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int nbG = random.nextInt(100);
        int nbU;
        int count= 0;
        
        while (true) 
        {
            System.out.print("\nTrouver le numéro gagnant\n> ");
            nbU = sc.nextInt();
            count+=1;

            if(nbU == nbG)
            {
                System.out.print("\nBravo vous avez trouvé en "+count+" essais");
                break;
            }
            else if (nbU>nbG) 
            {
                System.out.print("\nC'est inferieur à "+nbU);
            }
            else if (nbU<nbG) 
            {
                System.out.print("\nC'est superieur à "+nbU);
            }
        }
        sc.close();
    }
}
