package Exercices.Condition;
import java.util.Scanner;

public class Exo1 
{
    public static void main(String[]args)
    {
        // Initialisation du Scanner et de ma Variable
        Scanner Sc = new Scanner(System.in);
        int Nb;

        // Demander à l'utilisateur d'entrer un Nombre
        System.out.print("\nChoisisser un nombre entier Positif ou négatif\n> ");
        Nb = Sc.nextInt();

        // Verification si le nombre et positif ou négatif et l'afficher
        if(Nb>0)
        {
            System.out.print("\nVotre nombre est positif");
        }
        else if (Nb == 0) 
        {
            System.out.print("\nVous avez choisis 0 c'est un nombre neutre");
        }
        else
        {
            System.out.print("\nVotre nombre est négatif");
        }
        Sc.close();
    }
}
