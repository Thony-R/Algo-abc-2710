package ExerciceP1Bis;
import java.util.Random;
import java.util.Scanner;

public class Exo3_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int nb;

        System.out.println("Combien de nombre voulez vous générer ?");
        nb = sc.nextInt();
        sc.close();
        int[]nbNTrier = new int[nb];
        
        Exo3_4.rTableau(nbNTrier);

        System.out.println("\n");
        
        Exo3_4.tTableau(nbNTrier);

        System.out.println();

        
    }
        public static void rTableau(int[]nbNTrier)
        {
            Random rdm = new Random();
            for(int i = 0;i<nbNTrier.length;i++)
            {
                nbNTrier[i]= rdm.nextInt(315);
            }
            for(int i=0; i<nbNTrier.length;i++)
            {
                System.out.print(nbNTrier[i]+", ");
            }
        }

        public static void tTableau(int[]nbNTrier) 
        {
            int plus_petit,en_cours,temp;

            for(en_cours = 0;en_cours<nbNTrier.length -1;en_cours++)
            {
                plus_petit = en_cours;

                for(int j=en_cours+1;j<nbNTrier.length;j++)
                    if(nbNTrier[j]<nbNTrier[plus_petit])
                        plus_petit=j;

                temp = nbNTrier[en_cours];
                nbNTrier[en_cours]=nbNTrier[plus_petit];
                nbNTrier[plus_petit]=temp;
            }
            for(int i=0;i<nbNTrier.length;i++)
            {
                System.out.print(nbNTrier[i]+", ");
            }
        }
}