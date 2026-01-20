package ExoAlgo;

import java.util.Scanner;

public class Exercice2 
{
    public static void main(String[] args) 
    {
        int nb1 = 10;
        int nb2 = 20;
        int rep;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nChoisissez un nombre compris entre "+nb1+" et "+nb2+"\n> ");
        rep = sc.nextInt();
        while (!(rep>nb1 && rep<nb2)) 
        {
            if(rep>nb2)
            {
                System.out.print("\n Plus petit !\n> ");
                rep = sc.nextInt();
            }
            else
            {
                System.out.print("\n Plus grand !\n> ");
                rep = sc.nextInt();
            }
        }
        sc.close();
    }
}
