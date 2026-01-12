package ExerciceP1;

import java.util.Scanner;

import Outils.ScannersTypes;

public class Exo1_4 
{
    public static void main(String[] args) 
    {
        int s,n;
        double i;

        Scanner sc = new Scanner(System.in);

        System.out.println("quel est la somme que vous avez placée ?\n> ");
        ScannersTypes.INT(sc);
        s = sc.nextInt();

        System.out.println("Le nombre d'années de placement de la somme ?\n> ");
        ScannersTypes.INT(sc);
        n = sc.nextInt();

        System.out.println("L'intérêt offert par la banque ?\n> ");
        ScannersTypes.DOUBLE(sc);
        i = sc.nextDouble();

        System.out.println("intérêt simple : "+(s*(1+n*i)));
        System.out.println("\nintérêt composé : "+(s*Math.pow(1+i,n)));
        sc.close();
    }
}
