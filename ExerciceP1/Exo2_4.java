package ExerciceP1;
import java.util.Scanner;
import Outils.*;

public class Exo2_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.print("Veuillez saisir l'anné :\n> ");
        ScannersTypes.INT(sc);
        a = sc.nextInt();

        if (a%4==0 && (!(a%100==0) || a%400==0)) 
        {
            System.out.print(" l'année est bissextile");
        }
        else
        {
            System.out.print(" l'année n'est pas bissextile");
        }
        sc.close();
    }
}
