package Exercices;
import java.util.Scanner;

public class Exo13 
{
    public static void main(String[]args)
    {
        //Creation d'un objet scanner pour lire les entrer de l'utilisateur
        Scanner Sc = new Scanner(System.in);
        int Tc;
        Float Tm;

        //Demander à l'utilisateur de saisire la taille
        System.out.println("Donner une taille en centimètre ?");
        Tc = Sc.nextInt();

        //Calculer la taille en mètre
        Tm = (float) (Tc)/100;
        
        //Afficher le resultat
        System.out.println(Tc + " cm vaut " + Tm + " m.");
        Sc.close();
    }
}
