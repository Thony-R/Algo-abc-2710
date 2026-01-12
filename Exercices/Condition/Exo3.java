package Exercices.Condition;
import java.util.Scanner;
import Outils.ScannersTypes;

public class Exo3 
{
    public static void main(String[] args) 
    {
        // Initialisation du Scanner et des variable
        Scanner Sc = new Scanner(System.in);
        int Age;

        // Demander l'age de l'utilisateur
        System.out.print("Veuiller saisir votre age ?\n> ");
        ScannersTypes.INT(Sc);
        Age = Sc.nextInt();

        // Condition de l'age 
        if (Age == 6|| Age == 7) 
        {
            System.out.print("Vous ête Poussin");
        }
        else if (Age == 8 || Age == 9) 
        {
             System.out.print("Vous ête Pupille");
        }
        else if (Age == 10|| Age == 11) 
        {
             System.out.print("Vous ête Minime");
        }
        else if (Age >= 12) 
        {
             System.out.print("Vous ête Cadet");
        }
        else
        {
             System.out.print("Vous avez moin de 6 ans");
        }
        Sc.close();
    }
}
