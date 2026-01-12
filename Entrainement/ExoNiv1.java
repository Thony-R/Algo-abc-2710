package Entrainement;
import java.util.Scanner;

public class ExoNiv1
{
    public static void main(String[]args)
    {
        // Déclaration des variables
        Boolean Reponse = false;
        String QUESTION = "";
        String Commande = "";
        
        // Création de l'objet Scanner
        Scanner Sc = new Scanner(System.in);

        // Boucle questions & réponses
        for(int i = 1; i <= 4; i++)
        {
            // Initialisation des questions
            switch (i) {
                case 1:
                    QUESTION = "Bonjour, votre commande est avec viande (true) ou végétarien (false)";
                    break;
                case 2:
                    QUESTION = "Votre steak, vous le voulez saignant (true) ou à point (false) ?";
                    break;
                case 3:
                    QUESTION = "Frites (true) ou riz (false)";
                    break;
                case 4:
                    QUESTION = "Soda (true) ou eau gazeuse (false)";
                    break;
                default:
                    break;
            }
        
            // Poser la question
            System.out.println(QUESTION);
            Reponse = Sc.nextBoolean();

            // Vérifier la réponse
            switch(i) 
            {
                case 1:
                    if(Reponse)
                    {
                        Commande = Commande + " Viande";
                    }
                    else
                    {
                        Commande = Commande + " Végétarien";
                        i++; // Passer directement à la suite (pas de cuisson)
                    }
                    break;

                case 2:
                    if(Reponse)
                    {
                        Commande = Commande + " Saignant";
                    }
                    else
                    {
                        Commande = Commande + " À point";
                    }
                    break;

                case 3:
                    if (Reponse) 
                    {
                        Commande = Commande + "\nFrites";
                    }
                    else
                    {
                        Commande = Commande + "\nRiz";
                    }
                    break;

                case 4:
                    if (Reponse) 
                    {
                        Commande = Commande + "\nSoda";
                    }
                    else
                    {
                        Commande = Commande + "\nEau gazeuse";
                    }
                    break;
            }
        }

        // Afficher le résultat
        System.out.println("\nVotre commande : " 
                           + Commande 
                           + "\nMerci pour votre commande, ça sera prêt dans 20 min.");
        Sc.close();
    }
}