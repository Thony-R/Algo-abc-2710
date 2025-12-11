package Exercices;
import java.util.Scanner;
import Outils.ScannersTypes;

public class exo2 {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner EntrerClavier = new Scanner(System.in);
        int a, b;
        // Demander à l'utilisateur d'entrer deux entiers
        System.out.println("Entrer la valeur de a : ");
        ScannersTypes.INT(EntrerClavier);
        a = EntrerClavier.nextInt();

        System.out.println("Entrer la valeur de b : ");
        ScannersTypes.INT(EntrerClavier);
        b = EntrerClavier.nextInt();
        // Calculer et afficher la soustraction des deux entiers
        int soustraction =  a - b;
        System.out.println("La soustraction de a et b est : " + soustraction);
        EntrerClavier.close();
        }
}

