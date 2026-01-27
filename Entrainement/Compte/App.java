package Entrainement.Compte;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double montant;
        ObjCompte compteCourant = new ObjCompte("bonjour",400);
        ObjCompte secCompte = new ObjCompte("goodBy",400);

        System.out.print("\nMontant à transferé \n> ");
        montant = sc.nextDouble();
        sc.close();

        compteCourant.transfert(secCompte, montant);

        System.out.println(compteCourant.getSolde()+" : "+secCompte.getSolde());

        System.out.println(secCompte);
    }
}
