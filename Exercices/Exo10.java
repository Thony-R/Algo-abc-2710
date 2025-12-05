package Exercices;
import java.util.Scanner;

public class Exo10
{
    public static void main(String[]args)
    {
        //Déclaration des Variable
        int Résultat = 0;
        String Réponse;

        //Création d'un objet Scanner pour lire les entrer utilisateur
        Scanner Sc = new Scanner(System.in);

        //Posez les question est vérifier si le resultat et juste
        System.out.println("Question 1 : L'informatique a besoin des mathématiques ? (V/F)");
        Réponse = Sc.nextLine();
        if(Réponse.equalsIgnoreCase("v"))
        {
            Résultat++;
        }
        System.out.println("Question 2 : L'Algèbre de Boole a été inventé par Steve Jobs ? (V/F)");
        Réponse = Sc.nextLine();
        if(Réponse.equalsIgnoreCase("f"))
        {
            Résultat++;
        }
        System.out.println("Question 3 : En numération, la base de 10 va de 0 à 10 ? (V/F)");
        Réponse = Sc.nextLine();
        if(Réponse.equalsIgnoreCase("f"))
        {
            Résultat++;
        }
        System.out.println("Question 4 : Une table de vérité retourne l'expression algébrique (V/F)");
        Réponse = Sc.nextLine();
        if(Réponse.equalsIgnoreCase("v"))
        {
            Résultat++;
        }
        System.out.println("Question 5 : Git permet de stocker à distance son travail (V/F");
        Réponse = Sc.nextLine();
        if(Réponse.equalsIgnoreCase("v"))
        {
            Résultat++;
        }

        //Afficher les résultat
        System.out.println("Résultat du QUIZZ, vous avez "+ Résultat + " point(s) / 5");
        Sc.close();
    }
}