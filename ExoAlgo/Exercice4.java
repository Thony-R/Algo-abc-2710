package ExoAlgo;

import java.util.Scanner;

public class Exercice4 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int nbU;

        System.out.print("\nnombre de départ\n> ");
        nbU =sc.nextInt();

        int result = nbU;
        
        for(int i=1;i<nbU;i++)
        {
            result=result +i;
        }
        System.out.println(result);
        sc.close();
    }    
}
