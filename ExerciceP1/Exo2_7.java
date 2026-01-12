package ExerciceP1;
import java.util.Scanner;
import Outils.ScannersTypes;

public class Exo2_7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double k,convertion;

        System.out.print("\n Entrer une valeur en kilomètres comprise entre 0.01 et 1 000 000\n> ");
        ScannersTypes.DOUBLE(sc);
        k =sc.nextDouble();

        while (true) 
        {
            if (k<0.01 || k>1000000) 
            {
                System.out.print("\n Entrer une Valeur entre 0.01 et 1 000 000\n> ");
                ScannersTypes.DOUBLE(sc);
                k =sc.nextDouble();
            }
            else
            {
                break;
            }
        }
        convertion = Math.round(100.0*(k/1.609))/100.0;
        System.out.print("\n"+ k +" km vaut "+convertion+" miles" );
        sc.close();
    }
}
