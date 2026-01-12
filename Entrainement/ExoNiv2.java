package Entrainement;
import java.util.Scanner;
import java.util.ArrayList;

public class ExoNiv2 
{
    public static void main(String[] args) 
    {
        // Initialisation du Scanner, des variables et des tableaux dynamiques
        Scanner Sc = new Scanner(System.in);
        boolean Réponse = true;
        Double TPrix = 0.00;
        Double PrixEntrer;
        ArrayList<Double>Prix = new ArrayList<>();
        String ArticleEntrer;
        ArrayList<String> Articles = new ArrayList<>();

        // Boucle pour demander l'article, le prix et savoir si l'utilisateur veut autre chose
        while (Réponse) 
            {
                System.out.println("Bonjour, que voulez vous acheter ? :");
                ArticleEntrer = Sc.nextLine();
                Articles.add("\n"+ArticleEntrer);

                System.out.println("Combien, ça côute ?:");
                PrixEntrer = Sc.nextDouble();
                Prix.add(PrixEntrer);

                System.out.println("Voulez-vous acheter autre chose (true/false)?");
                Réponse = Sc.nextBoolean();

                Sc.nextLine();
            }

        // Boucle pour afficher les éléments des listes et calculer la somme totale des prix
        for(int i = 0; i < Articles.size(); i++) 
        {
            System.out.print("\nVotre liste de course :\n");
            System.out.println(Articles.get(i) + " - " + Prix.get(i) + " euro");
            TPrix = Prix.get(i) + TPrix;
        }

        // Afficher la somme totale
        System.out.println("\n\nTotal de vos courses : "+ TPrix +" euro");
        Sc.close();
    }
}