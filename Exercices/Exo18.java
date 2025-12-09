package Exercices;
import java.util.Scanner;

public class Exo18 
{
    public static void main(String[]args)
    {
        //Creation d'un objet scanner pour lire les entrer de l'utilisateur
        Scanner Sc = new Scanner(System.in);
        double Pret, Salaire, Apport;
        Boolean Cdi, AutrePropriété;

        //Demander l'utilisateur d'entrer les valeurs
        System.out.println("Quel est le montant de votre prêt ?");
        Pret = Sc.nextDouble();
        System.out.println("Quel est votre salaire ?");
        Salaire = Sc.nextDouble();
        System.out.println("Êtes-vous en CDI ? (true/false)");
        Cdi = Sc.nextBoolean();
        System.out.println("Combien avez-vous d'apport ?");
        Apport = Sc.nextDouble();

        //Verifier les condition pour le prêt
        if (Cdi && Salaire>3000 && Apport == (25*Pret)/100) 
        {
            System.out.println("Votre prêt a était accoder.");
        }
        else if (Apport == (25*Pret)/100)
        {
            System.out.println("Avez vous une autre propriété valant au minimun "+((75*Pret)/100)+" euro. (true/false)");
            AutrePropriété = Sc.nextBoolean();
            if (AutrePropriété) 
            {
                System.out.println("Votre prêt a était accoder.");
            }
            else
            {
                System.out.println("Votre prêt n'a pas pus être accoder.");
            }
        }
        else
        {
            System.out.println("Votre prêt n'a pas pus être accoder.");
        }       
        Sc.close();
    }
}
