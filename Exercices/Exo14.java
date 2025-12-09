package Exercices;

import java.util.Scanner;

public class Exo14 {
    public static void main(String[]args)
    {
        //Creation d'un objet scanner pour lire les entrer de l'utilisateur
        Scanner Sc = new Scanner(System.in);
        boolean A, B, C;

        //Demander à l'utilisateur de saisire les valeur
        System.out.println("Nous calculon F = A + B¬C");
        System.out.println("Entrer la valeur de A, B, C");
        A = Sc.nextBoolean();
        B = Sc.nextBoolean();
        C = Sc.nextBoolean();

        //Calculer l'expression
        boolean Résultat = A || B && !C;

        //Afficher le resultat
        System.out.println("Résultat : " + Résultat);
        Sc.close();
    }
}
