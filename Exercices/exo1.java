package Exercices;
import java.util.Scanner;
import Outils.ScannersTypes;

public class exo1 {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner sc = new Scanner(System.in);
        int a, b;

        // Demander à l'utilisateur d'entrer deux entiers
        System.out.println("Entrer la valeur de a : ");
        ScannersTypes.INT(sc);
        a = sc.nextInt();
        System.out.println("Entrer la valeur de b : ");
        ScannersTypes.INT(sc);
        b = sc.nextInt();
        // Calculer et afficher la somme des deux entiers
        int somme = a + b;
        System.out.println("La somme de a et b est : " + somme);
        sc.close();
    }
}
