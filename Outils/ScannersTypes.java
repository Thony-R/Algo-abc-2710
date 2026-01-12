package Outils;
import java.util.Scanner;

public class ScannersTypes
{
    // Verifie que les entrer sont des entiers
    public static void INT(Scanner Sc)
    {
        while (!Sc.hasNextInt()) 
        {
            System.out.print("\nVeuiller saisir un entier\n> ");
            Sc.next();
        }
    }
    // Verifie que les entrer sont des doubles
    public static void DOUBLE(Scanner Sc)
    {
        while (!Sc.hasNextDouble()) 
        {
            System.out.print("\nVeuiller saisir un nombre valide\n> ");
            Sc.next();
        }
    }
    // Verifie que les entrer sont des floats
    public static void FLOAT(Scanner Sc)
    {
        while (!Sc.hasNextFloat()) 
        {
            System.out.print("\nVeuiller saisir un nombre valide\n> ");
            Sc.next();
        }
    }
    // Verifie que les entrer sont des chaînes de caractères
    public static void STRING(Scanner Sc)
    {
        while (!Sc.hasNextLine()) 
        {
            System.out.print("\nVeuillez saisir une chaîne de caractères\n> ");
            Sc.next();
        }
    }
    // Verifie que les entrer sont des boolean
    public static void BOOL(Scanner Sc)
    {
        while (!Sc.hasNextBoolean()) 
        {
            System.out.print("\nVeuillez saisir true ou false\n> ");
            Sc.next();
        }
    }
}
