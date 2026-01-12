package Exercices;
import java.util.Scanner;

public class Exo15 
{
    public static void main(String[]args)
    {
        //Creation d'un objet scanner pour lire les entrer de l'utilisateur
        Scanner Sc = new Scanner(System.in);
        String DeviseI,DeviseF;
        Double Montant;
        Double MontantC = 0.0;
        //Demander à l'utilisateur de saisire les valeur
        System.out.println("Quel est votre monnaie ? (eur/usd/gbp)");
        DeviseI = Sc.nextLine().toLowerCase();
        System.out.println("Quel est votre montant ?");
        Montant = Sc.nextDouble();
        System.out.println("Vous voulez la convertir en quelle devise ? (eur/usd/gbp)");
        DeviseF = Sc.next().toLowerCase();

        Sc.close();

        //Verifier si les devise sont different 
        if (DeviseI==DeviseF)
        {
             System.out.println("Attention on ne peut pas convertir les deux même devise !");
        }

        //Faire la convertion
        switch (DeviseI)
        {
            case "eur":
                switch (DeviseF) 
                {
                    case "usd":
                        MontantC = Math.round(100.00*(Montant*1.1648))/100.00;
                        break;
                    case "gbp":
                        MontantC = Math.round(100.00*(Montant*0.8737))/100.00;
                        break;
                }
                break;
            case "usd":
                switch (DeviseF) 
                {
                    case "eur":
                        MontantC = Math.round(100.00*(Montant*0.8589))/100.00;
                        break;
                    case "gbp":
                        MontantC = Math.round(100.00*(Montant*0.7503))/100.00;
                        break;
                }
                break;
            case "gbp":
                switch (DeviseF) 
                {
                    case "eur":
                        MontantC = Math.round(100.00*(Montant*1.1446))/100.00;
                        break;
                    case "usd":
                        MontantC = Math.round(100.00*(Montant*1.3330))/100.00;
                        break;
                }
                break;
        }
        System.out.println("Résultat : "+MontantC+" "+DeviseF.toUpperCase());
    }
}   

