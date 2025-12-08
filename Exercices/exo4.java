package Exercices;

import java.util.Scanner;

public class exo4 
{
    public static void main(String[]args)
    {
        //Création d'un objet Scanner pour lire les entrer de l'utilisateur
        Scanner EntrerClavier = new Scanner(System.in);
        int a;

        //Demander a l'utilisateur d'entrer la valeur a 
        System.out.println("Entrer la valeur de a :");
        a = EntrerClavier.nextInt();

        //Calculer le reste de a pour savoir si il est divisible par 2
        int resultat = a % 2;
        if (resultat == 0)
        { 
            System.out.println("La valeur a est divisible par 2");
        }
        else
        {
            System.out.println("La valeur a n'est pas divisible par 2");
        }
        EntrerClavier.close();
    }
}
