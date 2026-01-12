package Exercices;
import java.util.Scanner;

public class Exo16 
{
    public static void main(String[]args)
    {
        //Creation d'un objet scanner pour lire les entrer de l'utilisateur
        Scanner Sc = new Scanner(System.in);
        int Age,Pdispo;
        String Business;
        Double Pvol;
        //Demander l'utilisateur d'entrer les valeurs
        System.out.println("Quel est l'âge de votre passager ?");
        Age = Sc.nextInt();
        System.out.println("Le passager veut-il une classe business (oui/non) ?");
         Business = Sc.next();
        System.out.println("Le prix du vol :");
        Pvol = Sc.nextDouble();
        System.out.println("Nombre de places disponibles :");
        Pdispo = Sc.nextInt();
        Double PvolF = Pvol;

        //Vérifier si l'utilisateur a une reduction ou une augmentation
        if(Age<18)
        {
            System.out.println("Réduction de 20%.");
            PvolF = PvolF - (20 * Pvol)/100;
        }
        else if(Age>60)
        {
            System.out.println("Réduction de 40%.");
            PvolF = PvolF - (40 * Pvol)/100;
        }
        if (Business.equalsIgnoreCase("oui"))
        {
            System.out.println("Augmentation de 20%.");
            PvolF = PvolF + (20 * Pvol)/100;
        }
        if(Pdispo>60)
        {
            System.out.println("Réduction de 20%.");
            PvolF = PvolF - (20 * Pvol)/100;           
        }
        else if(Pdispo<20)
        {
            System.out.println("Augmentation de 20%.");
            PvolF = PvolF + (20 * Pvol)/100;
        }

        //Afficher le resultat final
        System.out.println("Le prix du vol est de "+ PvolF +" euros");
        Sc.close();
    }
    
}