package ExerciceP1Bis;
import java.util.Scanner;

public class Exo3_7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String recherche;
        String[] prenom = {"agathe","berthe","chloé","cunégonde","olga","raymonde","sidonie"};
        
        System.out.print("\nPrénom chercher\n> ");
        recherche = sc.nextLine().toLowerCase();
        sc.close();

        int debut = 0;
        int fin = prenom.length - 1;
        boolean trouve = false;
        
        while (debut <= fin) 
        {
            int milieu = debut + (fin - debut) / 2;
            int comparaison = recherche.compareTo(prenom[milieu]);
            
            System.out.println("Comparaison avec " + prenom[milieu] + " : " + comparaison);
            
            if (comparaison == 0) 
            {
                System.out.println("Prénom trouvé à l'index " + milieu);
                trouve = true;
                break;
            }
            else if (comparaison > 0) 
            {
                debut = milieu + 1;
            }
            else 
            {
                fin = milieu - 1;
            }
        }
        
        if (!trouve) 
        {
            System.out.println("Prénom non trouvé dans le tableau.");
        }
    }
}