package ExoAlgo;

import java.util.Scanner;

public class Exercice9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long cheveauxP,cheveauxJ,x,y;

        System.out.print("\nnombre de chevaux partants\n> ");
        cheveauxP = sc.nextLong();
        System.out.print("\nnombre de chevaux joués\n> ");
        cheveauxJ = sc.nextLong();
        sc.close();

        x =Exercice9.factorielle(cheveauxP)/Exercice9.factorielle((cheveauxP-cheveauxJ));
        y = Exercice9.factorielle(cheveauxP)/(Exercice9.factorielle(cheveauxJ)*Exercice9.factorielle((cheveauxP-cheveauxJ)));
        System.out.println("1 sur "+x);
        System.out.println("1 sur "+y);
    }

    //formule factorielle
    public static long factorielle(long nb)
    {
        if(nb !=0)
        {
            return nb*factorielle(nb-1);
        }
        else
        {
            return 1;
        }
    }
}
