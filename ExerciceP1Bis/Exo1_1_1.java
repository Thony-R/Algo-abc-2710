package ExerciceP1Bis;
import java.util.Scanner;

public class Exo1_1_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String saisi; 
        String liste = "";
        String[]tab;
        int somme=0;
        double moyenne;
        boolean boucle = true;

        System.out.print("\nProgramme de calcul de la moyenne de 2 nombres.\n");

        while (boucle) 
        {

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
                    moyenne = Math.round(((double)somme/tab.length)*100.00)/100.00;
                    System.out.print("\nLa moyenne de "+liste+" est :"+moyenne);
                    boucle= false;
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
            sc.close();
        }
        
    }
}
