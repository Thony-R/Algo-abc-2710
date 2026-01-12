package ExerciceP1;
import java.util.Scanner;
import Outils.ScannersTypes;

public class Exo1_3 
{
    public static void main(String[] args) 
    {
        int a, r;
        double resultat;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est le rayon ?\n> ");
        ScannersTypes.INT(sc);
        r = sc.nextInt();

        System.out.println("Quel et langle en degré(s) ?\n> ");
        ScannersTypes.INT(sc);
        a = sc.nextInt();

        resultat = (Math.PI*Math.pow(r, 2)*a)/360;
        System.out.println(resultat);
        sc.close();
    }
}
