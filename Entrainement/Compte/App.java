package Entrainement.Compte;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int numE,numR,montant;
        Banque b = new Banque();
        b.Init();
        b.AjouteCompte("dutronc", 4500, -500);
        b.AfficherComptes();
        System.out.println();
        System.out.println(b.CompteSup().toString());
        System.out.println();
        System.out.print("\nEntrer un Numéros de compte\n> ");
        numE=sc.nextInt();
        System.out.print("\nEntrer un autre Numéros de compte\n> ");
        numR=sc.nextInt();
        System.out.print("\nSomme à transferer\n> ");
        montant = sc.nextInt();
        sc.close();

        if(b.Transfert(numE, numR, montant))
        {
            System.out.print("\nRéussis");
        }
        else
        {
            System.out.print("\nEchec de la transaction\n");
        }
    }
}