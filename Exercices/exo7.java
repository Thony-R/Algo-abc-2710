package Exercices;
import java.util.Scanner;

public class exo7 
{
    public static void main(String[] args) 
    {
        //Créatin d'un objet Scanner pour lire les entrer
        Scanner EntrerClavier = new Scanner(System.in);
        String Reponse;
    
        //Récuperation de la reponsse de l'utilisateur
        System.out.println("Do you speak english ? (Y / N)");
        Reponse = EntrerClavier.nextLine();

        //Une boucle pour verifier ci la saisi de l'utilisateur est Valide
        while (!Reponse.equals("y") && !Reponse.equals("Y") && !Reponse.equals("N") && !Reponse.equals("n")) 
        {
        System.out.print("Veuiller entrer (Y/y) ou (N/n) : ");
        Reponse = EntrerClavier.nextLine();
        }

        //Condition pour afficher le reponsse selon l'entrer
        if(Reponse.equals("y")|| Reponse.equals("Y") )
        {
            System.out.println("Nice to meet you");
        }
        else
        {
            System.out.println("So learn english !");
        }
        EntrerClavier.close();
    }
}
