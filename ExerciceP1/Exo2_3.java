package ExerciceP1;
import java.util.Scanner;
import Outils.*;

public class Exo2_3 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.print("valeur de a :\n> ");
        ScannersTypes.DOUBLE(sc);
        a = sc.nextDouble();

        System.out.print("valeur de b :\n> ");
        ScannersTypes.DOUBLE(sc);
        b = sc.nextDouble();

        System.out.print("valeur de c :\n> ");
        ScannersTypes.DOUBLE(sc);
        c = sc.nextDouble();

        if (a<b&&a<c) 
        {
            if (b<c) 
            {
                System.out.print("\n"+ a+", "+b+", "+c);
            }
            else 
            {
                System.out.print("\n"+ a+", "+c+", "+b);
            }
            
        }
        else if (b<a&&b<c) 
        {
            if (a<c) 
            {
                System.out.print("\n"+ b+", "+a+", "+c);
            }
            else 
            {
                System.out.print("\n"+ b+", "+c+", "+a);
            }
        }
        else if (c<a&&c<b) 
        {
            if (a<b) 
            {
                System.out.print("\n"+ c+", "+a+", "+b);
            }
            else
            {
                System.out.print("\n"+ c+", "+b+", "+a);
            }
        }
    }
}
