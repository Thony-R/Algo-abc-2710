package ExerciceP1;
import java.util.Scanner;
import Outils.ScannersTypes;

public class Exo3_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char rLettre;
        int nb=0;
        String phrase = "je suis un licorne qui fais de la programmation";

        System.out.print("\nQuel lettre recherché vous ?\n> ");
        ScannersTypes.STRING(sc);
        rLettre = sc.nextLine().charAt(0);


        for(int i=0;i<phrase.length();i++)
        {
            if(rLettre == phrase.charAt(i))
            {
                nb++;
            }
        }
        if(nb>0)
        {
            System.out.print("\nLa lettre est présente "+nb+" fois");
        }
        else
        {
            System.out.print("\nLa lettre n'est pas presente");
        }
    }
}
