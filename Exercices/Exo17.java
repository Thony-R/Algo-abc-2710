package Exercices;
import java.util.Scanner;

public class Exo17 
{
    public static void main(String[]args)
    {
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner Sc = new Scanner(System.in);
        int Carburant, Distance;
        double Prix = 0;
        
        // Demander à l'utilisateur d'entrer son carburant
        System.out.println("Quel est le type de votre carburant ?");
        Carburant = Sc.nextInt();

        // Afficher le carburant choisi
        switch (Carburant) 
        {
            case 0:
                System.out.println("Vous avez choisi : Gazole ");
                break;
            case 1:
                System.out.println("Vous avez choisi : Sans Plomb 95 ");
                break;
            case 2:
                System.out.println("Vous avez choisi : Sans Plomb 98 ");
                break;
        }

        // Demander à l'utilisateur d'entrer la distance
        System.out.println("Quel est la distance à parcourir (en km) ?");
        Distance = Sc.nextInt();

        // Calculer la somme dépenser pour le carburant
        switch (Carburant) 
        {
            case 0:
                Prix = Math.round(100.00*((5.51*Distance/100.00)*1.164))/100.00;
                break;
            case 1:
                Prix = Math.round(100.00*((6.51*Distance/100.00)*1.718))/100.00;
                break;
            case 2:
                Prix = Math.round(100.00*((6.51*Distance/100.00)*1.807))/100.00;
        }

        // Afficher le résultat
        System.out.println("Pour "+Distance+" km, vous allez dépenser en moyenne "+Prix+" euro");
        Sc.close();
    }
}
