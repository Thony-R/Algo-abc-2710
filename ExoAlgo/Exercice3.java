package ExoAlgo;

import java.util.Scanner;

public class Exercice3 
{
    public static void main(String[] args) 
    {
        int nbD;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nNombre de départ\n> ");
        nbD =sc.nextInt();
        sc.close();
        int boucle = nbD+1;
        for( int i=nbD+1 ;i<=nbD+10;i++)
        {
            System.out.println(i);
        }

        while (boucle<=nbD+10) 
        {
            System.out.println(boucle);
            boucle++;
        }
    }
}
