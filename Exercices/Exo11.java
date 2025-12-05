package Exercices;
import java.util.Scanner;

public class Exo11 
{
    public static void main(String[] args)
    {
        // Déclaration des variables 
        int Solde = 3000;
        int Retrait;
        
        // Création d'un objet Scanner pour lire les entrées de l'utilisateur
        Scanner Sc = new Scanner(System.in);

        // Demander à l'utilisateur combien il veut retirer
        System.out.println("Bonjour, combien voulez-vous retirer ?");
        Retrait = Sc.nextInt();

        // Vérifier si l'utilisateur a les fonds
        if(Retrait <= Solde)
        {
            Solde = Solde - Retrait;
            System.out.println("Opération acceptée. Votre solde restant est de " + Solde + " euros");
        }
        else
        {
            System.out.println("Opération refusée, fonds insuffisants !");
        }
        Sc.close();
    }   
}