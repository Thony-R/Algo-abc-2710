package ExerciceP1Bis;
import java.util.Scanner;
import Outils.Arrondi;


public class Emprunt
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int capitalEmprunte,nbrAnneeRbmt;
        double tauxInteretAnnuel;
        
        System.out.print("\nQuel montant désirez vous emprunter ?\n> ");
        capitalEmprunte = sc.nextInt();

        System.out.print("\nDuré de l'emprunt ?\n> ");
        nbrAnneeRbmt = sc.nextInt();

        System.out.print("\nQuel est votre taux d'interet annuel\n> ");
        tauxInteretAnnuel = sc.nextDouble();
        sc.close();
        
        // System.out.println(mensualitéConstante(capitalEmprunte, nbrAnneeRbmt, tauxInteretAnnuel));
  
        System.out.println(tableauMensualité(capitalEmprunte, nbrAnneeRbmt, tauxInteretAnnuel));
    }

    // public static double mensualitéConstante (int capitalEmprunte,int nbrAnneeRbmt,double tauxInteretAnnuel)
    // {
    //     double tauxInteretmensuel = tauxInteretAnnuel/1200;
    //     int nbMois = nbrAnneeRbmt*12;
    //     double q = (1-Math.pow((1+tauxInteretmensuel), -nbMois));
    //     double a = Arrondi.arrondi(capitalEmprunte*tauxInteretmensuel/q,2);
    //     return a;
    // }

    public static int[]tableauMensualité(int capitalEmprunte,int nbrAnneeRbmt, double tauxInteretAnnuel)
    {
        double tauxInteretmensuel = tauxInteretAnnuel/1200;
        int nbMois = nbrAnneeRbmt*12;
        double q = (1-Math.pow((1+tauxInteretmensuel), -nbMois));
        double a = Arrondi.arrondi(capitalEmprunte*tauxInteretmensuel/q,2);
        
        double par_intrert;
        int[]numMois = new int[nbMois];
        
        for(int i = 0; i<=nbMois;i++)
        {
            double k = capitalEmprunte ;
            numMois[i] = i+1;
            System.out.println(numMois[i]+" = "+k);
            a = a * i; 
        }

        return numMois;
    }
}