package Exercices.Condition;
import java.util.Scanner;

public class Exo2 
{
    public static void main(String[]args)
    {
        // Initialisation du Scanner et des Variable
        Scanner Sc = new Scanner(System.in);
        int Nb1, Nb2;

        //Demander à l'utilisateur d'entrer nb1 et 2
        System.out.print("Entrer la valeur de votre premier nombre (Positif ou négatif)\n> ");
        Nb1 = Sc.nextInt();

        System.out.print("\n\nEntrer la valeur de votre premier nombre (Positif ou négatif)\n> ");
        Nb2 = Sc.nextInt();

        //Vérifier le produit de ces deux nombre si il est positif ou négatif et print
        if(Nb1*Nb2>0)
        {
            System.out.print("\nLe produit des ces deux nombre et positif");
        }
        else if (Nb1*Nb2<0) 
        {
            System.out.print("\nLe produit des ces deux nombre et négatif");
        }
        else
        {
            System.out.print("\nLe produit des ces deux nombre et 0 un nombre neutre");
        }
        Sc.close();
    }
}
