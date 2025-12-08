package Exercices;
import java.util.Scanner;

public class exo6 
{
    public static void main(String[] args) 
    {

        //Creation d'un objet Scanner pour lire les entrer
        Scanner EntrerClavier = new Scanner(System.in);
        String Prenom;
        int Age;

        //Demander à l'utilisateur d'entrer son Prenom et son age 
        System.out.println("Quel et votre prenom ?");
        Prenom = EntrerClavier.nextLine();
        System.out.println("Quel et votre age ?");
        Age = EntrerClavier.nextInt();

        //afficher son prenom et son age en utilisant la concatenation
        System.out.println("Je m'appelle " + Prenom + ", j'ai "+ Age + " ans.");
        EntrerClavier.close();
    }
}
