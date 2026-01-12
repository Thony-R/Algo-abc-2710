package Entrainement;
import java.util.Scanner;
import Outils.ScannersTypes;

public class InverseMots 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String originale, inversée="";
        char stock;

        System.out.print("\nNotez votre mots ou phrase...\n> ");
        ScannersTypes.STRING(sc);
        originale = sc.nextLine();

        for(int i = originale.length()-1;i>=0;i--)
        {
            stock =  originale.charAt(i);
            inversée = inversée+ stock;
        }
        System.out.println(inversée);
    }
}
