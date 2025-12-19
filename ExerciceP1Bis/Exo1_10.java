package ExerciceP1Bis;
import java.util.Scanner;
import java.util.ArrayList;
public class Exo1_10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int j;
        int sTemp = 0;
        int i =1;
        ArrayList<Integer>nParfait = new ArrayList<>();

        System.out.print("\nProgramme de recherche des nombres parfaits.");
        System.out.print("\nCombien de nombre parfaits souhaitez-vous afficher ?\n> ");
        n = sc.nextInt();
        sc.close();

        while (nParfait.size()<n)
        {
            for(j=1;j<i;j++)
            {
                if (i%j==0) 
                {
                    sTemp+=j;
                  
                }
                
            }
            if(sTemp==i)
                {
                    nParfait.add(sTemp);
                }
        sTemp=0;
        i++;
        }
        System.out.println(nParfait);
    }
}
