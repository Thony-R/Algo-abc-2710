package ExerciceP1;
import java.util.Scanner;
import Outils.*;

public class Exo2_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.println("Quel est votre age ?\n> ");
        ScannersTypes.INT(sc);
        a = sc.nextInt();

        if (a<18) 
        {
            System.out.println("Vous êtes mineure");
        }
        else if (a>18) 
        {
            System.out.println("Vous êtes majeur");
        }
        else
        {
            System.out.println("Vous n'êtes pas né");
        }
        sc.close();
    }
}