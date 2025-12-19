package ExerciceP1Bis;
import java.util.Scanner;

public class Exo1_1_2 
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String saisi,reponse; 
        
        String[]tab;
        int somme=0;
        double moyenne;
        boolean boucle1 = true;

        System.out.print("\nProgramme de calcul de la moyenne de 2 nombres.\n");

        while (boucle1) 
        {

            String liste = "";
            boolean boucle2 =false;
            System.out.print("\nVeuillez saisir 2 nombres séparés par un espace :\n> ");
        
            saisi = sc.nextLine();
            tab = saisi.split(" ");

            if (tab.length == 2) 
            {
                try
                {
                    for(int i = 0; i<tab.length;i++)
                    {
                        somme = somme + Integer.parseInt(tab[i]);
                        liste = liste + tab[i]+" et ";
                    }
                    liste = liste.substring(0,liste.length()-4);
                    moyenne = Math.round(100.0*((double)somme/tab.length))/100.0;
                    System.out.print("\nLa moyenne de "+liste+" est :"+moyenne);
                    boucle2 = true;
                }
                catch (NumberFormatException e)
                {
                    System.out.print("\nRéessayer");
                }         
            }
            else
            {
                System.out.print("\n2 valeurs sont demandées.");
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
