package Exercices;

import java.util.Scanner;
import Outils.ScannersTypes;

public class exo5 {

    public static void main(String[]args)
    {
        //Création d'un objet Scanner pur lire les entrer de l'utilisateur 
        Scanner EntrerClavier = new Scanner(System.in);
        int a, b, c;
         
        //Demander à l'utilisateur d'entrer la valeur de a, b et c
        System.out.println("Entrer la valeur de a :");
        ScannersTypes.INT(EntrerClavier);
        a = EntrerClavier.nextInt();

        System.out.println("Entrer la valeur de b :");
        ScannersTypes.INT(EntrerClavier);
        b = EntrerClavier.nextInt();

        System.out.println("Entrer la valeur de c :");
        ScannersTypes.INT(EntrerClavier);
        c = EntrerClavier.nextInt();

        //Calculer l'equation
        int resultat = a * b / c;

        //Verifier si le resultat est superieur à 10
        if (resultat > 10) 
        {
            System.out.println("Le resultat est superieur à 10");
        }
        else
        {
            System.out.println("Le resultat est inferieur à 10");
        }
        EntrerClavier.close();
    }
}