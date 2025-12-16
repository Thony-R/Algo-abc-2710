package ExerciceP1;
import java.util.Scanner;
import Outils.ScannersTypes;


public class Exo3_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int nbU;
        boolean trouvé = false;

        int[] tabl = {1,9,17,25,33,41,49,57,65,73,81,89,97,105,113,121,129,137,145,153,161,169,177,185,193,201,209,217,225,233,241,249};

        System.out.print("\nChercher un nombre :\n> ");
        ScannersTypes.INT(sc);
        nbU = sc.nextInt();
        
       
        for(int i=0; i<tabl.length;i++)
        {
            if(tabl[i]==nbU)
            {
                System.out.print("\nVotre nombre est dans l'emplacement "+i+" du tableau.");
                trouvé = true;
                break;
            }
        }

        if(!trouvé)
        {
            System.out.print("\n404 NOT found");
        }
    }
}
