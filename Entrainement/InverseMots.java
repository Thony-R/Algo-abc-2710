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

        System.out.println(inverse(originale));
    }
    public static String inverse(String user)
    {
        if(user.length()>0)
        {
            return user.charAt(user.length()-1) + inverse(user.substring(0, user.length()-1));
        }
        else
        {
            return user;
        }
    }
}
