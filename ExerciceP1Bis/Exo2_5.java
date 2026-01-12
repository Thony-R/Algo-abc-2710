package ExerciceP1Bis;
import java.util.Scanner;
import java.util.Random;

public class Exo2_5
{
    public static void main(String[] args) 
    {
        Random rdm = new Random();
        Scanner sc = new Scanner(System.in);
        int ordi;
        int ptU = 0;
        int ptO = 0;
        int user;
        

        while (ptU < 10 && ptO < 10) 
        {
            ordi = rdm.nextInt(3);

            System.out.print("\nChoisissez un nombre entre 0 et 2\n> ");
            user = sc.nextInt();

            if(user<0)
            {
                break;
            }
            switch (user) 
            {
                case 0:
                    switch (ordi) 
                    {
                        case 0:
                            System.out.println("Aucun point");
                            System.out.println("Score utilisateur = "+ptU+" , Score ordi = "+ptO);
                            break;
                        case 1:
                            System.out.println("Utilisateur gagne 1 point");
                            ptU++;
                            System.out.println("Score utilisateur = "+ptU+" , Score ordi = "+ptO);
                            break;
                        case 2:
                            System.out.println("Ordi gagne 1 point");
                            ptO++;
                            System.out.println("Score utilisateur = "+ptU+" , Score ordi = "+ptO);
                            break;
                    }
                    break;
                case 1:
                    switch (ordi) 
                    {
                        case 0:
                            System.out.println("Ordi gagne 1 point");
                            ptO++;
                            System.out.println("Score utilisateur = "+ptU+" , Score ordi = "+ptO);
                            break;
                    
                        case 1:
                            System.out.println("Aucun point");
                            System.out.println("Score utilisateur = "+ptU+" , Score ordi = "+ptO);
                            break;
                        
                        case 2:
                            System.out.println("Utilisateur gagne 1 point");
                            ptU++;
                            System.out.println("Score utilisateur = "+ptU+" , Score ordi = "+ptO);
                            break;
                    }
                    break;
                case 2:
                    switch (ordi) 
                    {
                        case 0:
                            System.out.println("Utilisateur gagne 1 point");
                            ptU++;
                            System.out.println("Score utilisateur = "+ptU+" , Score ordi = "+ptO);
                            break;
                    
                        case 1:
                            System.out.println("Ordi gagne 1 point");
                            ptO++;
                            System.out.println("Score utilisateur = "+ptU+" , Score ordi = "+ptO);
                            break;
                        case 2:
                            System.out.println("Aucun point");
                            System.out.println("Score utilisateur = "+ptU+" , Score ordi = "+ptO);
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}