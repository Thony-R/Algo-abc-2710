package ExerciceP1Bis;
import java.util.Scanner;

public class Exo3_7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String recherche;
        String[] prenom = {"agathe","berthe","chloé","cunegonde","cunégonde","olga","raymonde","sidonie"};
        int calcule = prenom.length/2;

        System.out.print("\nPénom chercher\n> ");
        recherche = sc.nextLine().toLowerCase();

        System.out.println(recherche.compareTo(prenom[calcule]));

    }
}
