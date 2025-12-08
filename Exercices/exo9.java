package Exercices;
import java.util.Scanner;


public class exo9 
{
    public static void main(String[]args)
    {
        //Création d'un objet Scanner pour lire les entrer de l'utilisateur
        Scanner EntrerClavier = new Scanner(System.in);
        String Prenom, Nom, Email, Pass, VerifPass,Email1,pass1;
        
        //Demander à l'utilisateur d'entrer les reponsse attendu
        System.out.println("Votre prénom ?");
        Prenom = EntrerClavier.nextLine();
        System.out.println("Votre nom ?");
        Nom = EntrerClavier.nextLine();
        System.out.println("Votre adresse email ?");
        Email = EntrerClavier.nextLine();
        System.out.println("Votre mot de passe ?");
        Pass = EntrerClavier.nextLine();
        System.out.println("Confirmer votre mot de passe ?");
        VerifPass = EntrerClavier.nextLine();

        //Verifier que les deux mots passe sont idententique
        if(Pass.equals(VerifPass) )
        {
            System.out.println("Merci "+ Prenom + " "+ Nom + ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adrese : "+ Email);
        }
        else
        {
            System.out.println("Inscription annulée");
        }
        System.out.println("Pour vous connecter, reseignez voitre mail ?");
        Email1 = EntrerClavier.nextLine();
        System.out.println("Renseignez votre mot de passe ?");
        pass1 = EntrerClavier.nextLine();
        if(Pass.equals(pass1) && Email.equals(Email1))
        {
            System.out.println("Vous êtes connecter");
        }
        else
        {
            System.out.println("Votre mot de passe ou votre email et incorrect");
        }
        EntrerClavier.close();
    }
}
