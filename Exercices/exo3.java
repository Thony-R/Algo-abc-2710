package Exercices;
import java.util.Scanner;
import Outils.ScannersTypes;

public class exo3
{
    public static void main(String[] args) 
    {
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner EntrerClavier = new Scanner(System.in);
        float a, b;
        
        // Demander à l'utilisateur de rentrer la valeur de a et de b
        System.out.println("Entrer la valeur de a : ");
        ScannersTypes.FLOAT(EntrerClavier);
        a = EntrerClavier.nextFloat();
        
        System.out.println("Entrer la valeur de b : ");
        ScannersTypes.FLOAT(EntrerClavier);
        b = EntrerClavier.nextFloat();
        
        // Calculer la somme de et b
        float resultat = a + b;

        // Vérifier si le resultat est paire ou impaire
        if (resultat % 2 == 0 ) 
        {
            System.out.println("Le resultat est paire");
        }
        else
        {
            System.out.println("Le resultat est impaire");
        }
        EntrerClavier.close();
    }
}
