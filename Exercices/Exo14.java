package Exercices;

import java.util.Scanner;

public class Exo14 {
    public static void main(String[]args)
    {
        Scanner Sc = new Scanner(System.in);
        boolean A, B, C;

        System.out.println("Nous calculon F = A + B¬C");
        System.out.println("Entrer la valeur de A, B, C");
        A = Sc.nextBoolean();
        B = Sc.nextBoolean();
        C = Sc.nextBoolean();

        boolean Résultat = A || B && !C;
        System.out.println("Résultat : " + Résultat);
        Sc.close();
    }
}
