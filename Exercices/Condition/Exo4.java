package Exercices.Condition;
import java.util.Scanner;
import Outils.ScannersTypes;

public class Exo4
{
    public static void main(String[]args)
    {
        // Initialisation du Scanner et des variable
        Scanner Sc = new Scanner(System.in);
        int Heure,Minute,Seconde;

        // Predire l'avenire 1 minute ++
        System.out.print("Quel heure est il ? (Heure et Minute)\n> ");
        ScannersTypes.INT(Sc);
        Heure = Sc.nextInt();
        System.out.print("\n> ");
        ScannersTypes.INT(Sc);
        Minute = Sc.nextInt();
        Minute +=1;

        //Print résultat
        System.out.print("Dans une minute, il sera "+Heure+"Heure(s) "+Minute);
        

        // Predire l'avenire une seconde ++
        System.out.print("Quel heure est il ? (Heure, Minute et Seconde)\n> ");
        ScannersTypes.INT(Sc);
        Heure = Sc.nextInt();
        System.out.print("\n> ");
        ScannersTypes.INT(Sc);
        Minute = Sc.nextInt();
        System.out.print("\n> ");
        ScannersTypes.INT(Sc);
        Seconde = Sc.nextInt();
        Seconde += 1;

        //Print résultat
        System.out.print("Dans une seconde, il sera " +Heure+" Heure(s), "+Minute+" minute(s) et "+Seconde+" seconde(s)");
    }
}