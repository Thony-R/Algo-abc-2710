package ExerciceP1Bis;

import java.util.Scanner;

public class Exo1_1_3 
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String saisi,reponse; 
        String[]tab;
        double moyenne;
        boolean boucle1 = true;
        

        System.out.print("\nProgramme de calcul de la moyenne de plusieurs nombres.\n");

        while (boucle1) 
        {
            
            boolean boucle2 = false;
            String liste = "";
            int somme=0;

            System.out.print("\nVeuillez saisir plusieurs nombres séparés par un espace :\n> ");
        
            saisi = sc.nextLine();
            tab = saisi.split(" ");

            try
            {
                for(int i = 0; i<tab.length - 1;i++)
                {
                    somme = somme + Integer.parseInt(tab[i]);
                    liste = liste + tab[i]+", ";
                }
                somme =somme +Integer.parseInt(tab[tab.length-1]);
                liste = liste.substring(0,liste.length()-2);
                liste = liste + " et "+tab[tab.length-1];
                moyenne = Math.round(100.0*((double)somme/tab.length))/100.0;
                System.out.print("\nLa moyenne de "+liste+" est :"+moyenne);
                boucle2 = true;
            }

            catch (Exception e)
            {
                System.out.print("\nRéessayer");
            }

            while (boucle2) 
            {
                System.out.print("\nSouhaitez-vous faire un autre calcul ? (O/N)\n> ");
                reponse = sc.nextLine();
                if (reponse.equalsIgnoreCase("o")) 
                {
                    break;
                }
                else if (reponse.equalsIgnoreCase("n")) 
                {
                    sc.close();
                    System.exit(0);
                }
            }
        }
        
    }
}
