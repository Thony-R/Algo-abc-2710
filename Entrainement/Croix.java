package Entrainement;

import java.util.Scanner;

public class Croix
{
    public static void main(String[] args)
    {
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner sc = new Scanner(System.in);
        int X;

        // Demande à l'utilisateur d'entrer une valeur
        System.out.println("Veuillez entrer la valeur X :");
        X = sc.nextInt();

        // Boucle où i représente la verticale et j l'horizontale pour afficher une croix
        for(int i = 0; i < X; i++)
        {
            for(int j = 0; j < X; j++)
            {
                if(i == j || i == X - j - 1)
                {
                    System.out.print("X");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        sc.close();
    }
}
