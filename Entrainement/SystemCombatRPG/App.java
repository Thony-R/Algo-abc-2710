package Entrainement.SystemCombatRPG;
import java.util.Scanner;
import Entrainement.SystemCombatRPG.SystemCombat.Guerrier;
import Entrainement.SystemCombatRPG.SystemCombat.Mage;
import Entrainement.SystemCombatRPG.SystemCombat.Personnage;


public class App 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String pseudo;
        int classe;
        Personnage joueur1 = null;
        Personnage joueur2 = null;

        System.out.print("\nJoueur 1 quel est votre pseudo\n> ");
        pseudo = sc.nextLine();
        do 
        {
            System.out.print("\nChoisissez votre classe entre Mage ou guerrier (Mage = 1 / Guerrier = 2)\n> ");
            classe =sc.nextInt();
        } while (classe < 1 || classe > 2);

        switch (classe) 
        {
            case 1:
                joueur1 = new Mage(pseudo,50);
                break;
        
            case 2:
                joueur1 = new Guerrier(pseudo,50);
                break;
        }
        sc.nextLine();
        System.out.print("\nJoueur 2 quel est votre pseudo\n> ");
        pseudo = sc.nextLine();
        do 
        {
            System.out.print("\nChoisissez votre classe entre Mage ou guerrier (Mage = 1 / Guerrier = 2)\n> ");
            classe =sc.nextInt();
        } while (classe < 1 || classe > 2);

        switch (classe) 
        {
            case 1:
                joueur2 = new Mage(pseudo,50);
                break;
        
            case 2:
                joueur2 = new Guerrier(pseudo,50);
                break;
        }

        System.out.println(joueur1.getNom()+" attaque : "+joueur2.getNom());
        joueur1.attaque(joueur2);
        System.out.println("\n\n"+joueur2.toString());
        System.out.println(joueur2.getNom()+" attaque : "+joueur1.getNom());
        joueur2.attaque(joueur1);
        System.out.println("\n\n"+joueur1.toString());
        sc.close();
    }    
}
