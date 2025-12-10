package Entrainement;

import java.util.Scanner;

public class Croix
{

    public static void croix_thony(int X)
    {
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
    }

    public static void croix_ekrebs(int X)
    {
        int m1;
        int m2;
        int caractere;
        int ligne;

        m1 = 0; //commence au debut de la ligne
        m2 = X -1; //commence a la fin de la ligne. //fin = X-1 car la croix va de 0 a X-1 pour avoir X de largeur...
        ligne = 0;
        while(ligne < X)
        {
            caractere = 0;
            while(caractere < X)
            {
                if (caractere == m1 || caractere == m2) //si le caractere sur lequel je suis, c'est celui du marqueur m&, ou celui du marqueur m2, j'affiche X
                    System.out.print("X");
                else
                    System.out.print(" ");
                caractere++;
            }
            System.out.println();
            ligne++;
            m1++;
            m2--;
        }
    }
    public static void main(String[] args)
    {
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner sc = new Scanner(System.in);
        int X, version;

        // Demande à l'utilisateur d'entrer une valeur
        System.out.println("Veuillez entrer la valeur X :");
        X = sc.nextInt();

        System.out.print("Version de la croix ? (thony:1 , ekrebs:2)\n> ");
        version = sc.nextInt();

        if (version ==1)
            croix_thony(X);
        else if (version == 2)
            croix_ekrebs(X);
        else
            System.out.println("Echec du cerveau détécté..\n");

        sc.close();
    }
}
