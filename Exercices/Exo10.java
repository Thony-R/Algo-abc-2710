package Exercices;
import java.util.Scanner;

public class Exo10
{
    public static void main(String[] args)
    {
        // Déclaration des variables
        int Résultat = 0;
        String Réponse;

        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner Sc = new Scanner(System.in);

        // Poser les questions et vérifier si la réponse est correcte
        System.out.println("Question 1 : L'informatique a besoin des mathématiques ? (V/F)");
        Réponse = Sc.nextLine();
        if (Réponse.equalsIgnoreCase("v"))
        {
            Résultat++;
        }

        System.out.println("Question 2 : L'Algèbre de Boole a été inventée par Steve Jobs ? (V/F)");
        Réponse = Sc.nextLine();
        if (Réponse.equalsIgnoreCase("f"))
        {
            Résultat++;
        }

        System.out.println("Question 3 : En numération, la base 10 va de 0 à 10 ? (V/F)");
        Réponse = Sc.nextLine();
        if (Réponse.equalsIgnoreCase("f"))
        {
            Résultat++;
        }

        System.out.println("Question 4 : Une table de vérité retourne l'expression algébrique ? (V/F)");
        Réponse = Sc.nextLine();
        if (Réponse.equalsIgnoreCase("v"))
        {
            Résultat++;
        }

        System.out.println("Question 5 : Git permet de stocker à distance son travail ? (V/F)");
        Réponse = Sc.nextLine();
        if (Réponse.equalsIgnoreCase("v"))
        {
            Résultat++;
        }

        // Afficher le résultat
        System.out.println("Résultat du QUIZ : vous avez " + Résultat + " point(s) sur 5.");
        Sc.close();
    }
}
