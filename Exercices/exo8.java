package Exercices;
import java.util.Scanner;

import Outils.ScannersTypes;

public class exo8 
{
    public static void main(String[] args) 
    {
        //Création d'un objet Scanner pour lire les entrer de l'utilisateur
        Scanner EntrerClavier = new Scanner(System.in);
        String Prenom, Nom, Email, Pass, VerifPass;
        
        //Demander à l'utilisateur d'entrer les reponsse attendu
        System.out.println("Votre prénom ?");
        ScannersTypes.STRING(EntrerClavier);
        Prenom = EntrerClavier.nextLine();

        System.out.println("Votre nom ?");
        ScannersTypes.STRING(EntrerClavier);
        Nom = EntrerClavier.nextLine();

        System.out.println("Votre adresse email ?");
        ScannersTypes.STRING(EntrerClavier);
        Email = EntrerClavier.nextLine();

        System.out.println("Votre mot de passe ?");
        ScannersTypes.STRING(EntrerClavier);
        Pass = EntrerClavier.nextLine();

        System.out.println("Confirmer votre mot de passe ?");
        ScannersTypes.STRING(EntrerClavier);
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
        EntrerClavier.close();
    }
}
