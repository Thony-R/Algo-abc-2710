package Exercices;
import java.util.Scanner;

public class Exo12 {
    public static void main(String[]args)
    {
        // Création d'un objet Scanner pour lire les entrées
        Scanner Sc = new Scanner(System.in);

        // Déclaration des variables pour le prix et la réduction
        float Prix, Reduction;

        // Demander le prix à l'utilisateur
        System.out.println("Votre prix ?");
        Prix = Sc.nextFloat();

        // Demander le pourcentage de réduction
        System.out.println("Votre réduction (en pourcentage %) ?");
        Reduction = Sc.nextFloat();

        //Calculer le prix final après réduction
        float Resultat = Prix - (Reduction * Prix)/100;
        
        //Afficher le résultat final
        System.out.println("Prix après réduction de " + Reduction +"% : "+ Resultat+"€" );
        Sc.close();
    }
}