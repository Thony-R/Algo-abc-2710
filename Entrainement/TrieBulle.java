package Entrainement;
import java.util.Random;
import java.util.Scanner;

public class TrieBulle 
{
    public static void main(String[]args)
    {
        int nbU,enCours,temp;
        int passage=0;        
        boolean permut=true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Combien de nombre voulez vous générer ?");
        nbU = sc.nextInt();
        sc.close();
        int []tab = new int[nbU];
        
        TrieBulle.rTableau(tab);

        while (permut) 
        {
            permut = false;
            passage++;
            for(enCours=0;enCours<nbU-passage;enCours++)
            {
                if(tab[enCours]>tab[enCours+1])
                {
                    permut = true;
                    temp = tab[enCours];
                    tab[enCours]=tab[enCours+1];
                    tab[enCours+1]=temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<tab.length;i++)
        {
            System.out.print(tab[i]+", ");
        }
        System.out.println();
        System.out.println("nombre de passage "+passage);
    }   
        public static void rTableau(int[]tab)
        {
            Random rdm = new Random();
            for(int i = 0;i<tab.length;i++)
            {
                tab[i]= rdm.nextInt(315);
            }
            for(int i=0; i<tab.length;i++)
            {
                System.out.print(tab[i]+", ");
            }
        }
}
