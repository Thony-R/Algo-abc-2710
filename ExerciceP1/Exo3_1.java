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
        int max = 100;
        int min =0;
        int count= 0;
        int countMdph =0;
        
        System.out.print("\nTrouver le numéro gagnant entre "+min+" est "+max+"\n> ");
        nbU = sc.nextInt();

        while (true) 
        {
            if (nbU>min && nbU<max) 
            {
                count+=1;
                if(nbU == nbG)
                {
                System.out.print("\nBravo vous avez trouvé en "+count+" essais (Erreur "+countMdph+")");
                break;
                }
                else if (nbU>nbG) 
                {
                    max = nbU;
                    System.out.print("\nC'est entre "+min+" est "+max+"\n> ");
                    nbU = sc.nextInt();
                }
                else if (nbU<nbG)
                {
                    min = nbU;
                    System.out.print("\nC'est entre "+min+" est "+max+"\n> ");
                    nbU = sc.nextInt();
                }
            }
            else
            {
                    System.out.print("\nRéessayer le numéro gagnant entre "+min+" est "+max+"\n> ");
                    nbU = sc.nextInt();
                    countMdph+=1;
            }
        }
        sc.close();
    }
}
