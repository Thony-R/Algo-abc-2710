package ExerciceP1;
import java.util.Scanner;
import Outils.ScannersTypes;
public class Exo1_5 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int a,b,t;

        System.out.println("Valeur de a ?\n> ");
        ScannersTypes.INT(sc);
        a = sc.nextInt();

        System.out.println("Valeur de b ?\n> ");
        ScannersTypes.INT(sc);
        b = sc.nextInt();

        System.out.println("a est : "+a+"\n");
        System.out.println("b est : "+b+"\n");

        t = a;
        a = b;
        b = t; 

        System.out.println("a est : "+a+"\n");
        System.out.println("b est : "+b+"\n");
    }
}
