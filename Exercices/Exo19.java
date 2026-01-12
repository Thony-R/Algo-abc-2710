package Exercices;
import java.util.Scanner;

public class Exo19 {
    public static void main(String[] args) 
    {
        //Creation d'un objet scanner pour lire les entrer de l'utilisateur
        Scanner Sc = new Scanner(System.in);
        int SecondeI,SecondeF, Heure, Minute;

        //Demander à l'utilisateur Combien de seconde faut convertire
        System.out.println("Combien de secondes ?");
        SecondeI = Sc.nextInt();
        Sc.close();

        //Calculer les heures, les minutes et secondes
        Heure = SecondeI/3600;
        SecondeF = SecondeI%3600;
        Minute = SecondeF/60;
        SecondeF = SecondeF%60;

        //afficher le resultat
        System.out.println(SecondeI+" secondes correspond à : "+Heure+" heures, "+Minute+" minutes et "+SecondeF+" secondes");
    }
}
