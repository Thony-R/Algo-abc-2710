package Exercices;
import java.util.Scanner;

public class Exo20 
{
    public static void main(String[]args)
    {
        //Creation d'un objet scanner pour lire les entrer de l'utilisateur
        Scanner Sc = new Scanner(System.in);
        Float VotantsJ, VotantsV;
        int Votants = 150000;

        //Demander à l'utilisateur le nombre de votant pour X candidat
        System.out.println("Combien de gens ont voté pour Joseline Inutile ?");
        VotantsJ = Sc.nextFloat();
        System.out.println("Combien de gens ont voté pour Vincent Escreau ?");
        VotantsV = Sc.nextFloat();

        //Afficher le nombre d'abstention
        System.out.println("Vous avez "+(Votants-(VotantsJ+VotantsV))+" d'abstentions, ils seront compté nul.");

        //Calculer le pourcentage de vote en fonction du candidat
        System.out.println("Joseline Inutile : "+(Math.round(100.0*(VotantsJ*100)/(VotantsJ+VotantsV))/100.0)+"%");
        System.out.println("Vincent Escreau : "+(Math.round(100.00*(VotantsV*100)/(VotantsJ+VotantsV))/100.00)+"%");

        //afficher le gagnant
        if (VotantsJ>VotantsV) 
        {
            System.out.println("Joseline Inutile est la nouvelle maire de Mulhouse.");
        }
        else
        {
            System.out.println("Vincent Escreau est le nouveau maire de Mulhouse.");
        }
        Sc.close();
    }
}
