package ExerciceP1;
import java.util.Scanner;
import Outils.ScannersTypes;

public class Exo2_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.println("Donner la valeur a :\n>");
        ScannersTypes.INT(sc);
        a = sc.nextInt();

        System.out.println("Donner la valeur b :\n>");
        ScannersTypes.INT(sc);
        b = sc.nextInt();

        if (a<b) 
        {
            System.out.print("\n "+a+", "+b);
        }
        else
        {
            System.out.print("\n "+b+", "+a);
        }
        sc.close();
    }
}
