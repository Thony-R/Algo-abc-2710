package ExoAlgo;
import java.util.Scanner;

public class Exercice1 
{
    public static void main(String[] args) 
    {
        int nb1 = 1;
        int nb2 = 3;
        int rep;
        Scanner sc = new Scanner(System.in);
        do 
        {
            System.out.print("\nChoisissez un nombre compris entre "+nb1+" et "+nb2+"\n> ");
            rep =sc.nextInt();
        } while (!(rep>nb1 && rep<nb2));
        sc.close();
    }
}
