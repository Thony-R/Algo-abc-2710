package Entrainement;
import java.util.Scanner;

public class ExoNiv3 
{
    public static void main(String[]args)
    {
        Scanner Sc = new Scanner(System.in);
        int Réponse,SoldeR,SoldeA;
        int Solde = 2000;
        boolean Boucle = true;
        while (Boucle) 
        {
            System.out.print("\nBienvenu sur votre compte bancaire, que puis-je faire pour vous :\n(0)Quitter\n(1)Retirer de l'argent\n(2)Consulter votre solde\n(3)Déposer de l'argent\n> ");
            Réponse = Sc.nextInt();
            
            switch (Réponse)
            {
                case 0:
                    Boucle = false;
                    break;
                case 1:
                    System.out.print("\nCombien voulez-vous retirer ?:\n> ");
                    SoldeR = Sc.nextInt();
                    if (SoldeR%10 == 0) 
                    {   
                        if ((Solde - SoldeR) >= -500 ) 
                        {
                            Solde= Solde - SoldeR;
                            System.out.print("\nOpération acceptée : "+SoldeR+" euro ont été retiré.");
                        }
                        else
                        {
                            System.out.print("\nDésolé, vous ne pouvez pas retirer plus que votre solde (Découvert autorisé jusqu'à : - 500 euro)");
                        }
                    }
                    else
                    {
                        System.out.print("\nDésolé, vous ne pouvez retirer qu'en multiple de 10.");
                    }
                    break;
                case 2:
                    System.out.print("\nVotre solde est de : "+Solde+" euro");
                    break;
                case 3:
                    System.out.print("\nCombien voulez-vous déposer ?:\n> ");
                    SoldeA = Sc.nextInt();
                    if ((SoldeA%5)==0) 
                    {
                        System.out.print("\nOpération acceptée : "+SoldeA+" euro ont été déposé.");
                        Solde=Solde + SoldeA;
                    }
                    else
                    {
                        System.out.print("\nDésolé vous ne pouvez déposer que des billets");
                    }
                    break;
                default:
                    System.out.print("\nChoix incorect");
                    break;
            }
        }

        Sc.close();
    }
}
