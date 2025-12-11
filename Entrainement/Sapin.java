package Entrainement;
import java.util.Scanner;

public class Sapin 
{
    public static void main(String[]args)
    {
        Scanner Sc = new Scanner(System.in);
        int HSapin,LSapin,Y;

        System.out.print("Choisir la hauteur de votre sapin\n> ");
        HSapin = Sc.nextInt();

        LSapin = (HSapin*2)-1;
        
        for(Y = 0; Y < HSapin; Y++)
        {
            for(int X =0;X<LSapin;X++)
            {
                if ((X <= (LSapin/2)+Y) && !(X<(LSapin/2))|| (X >= (LSapin/2)-Y) && !(X>(LSapin/2))) 
                {
                    System.out.print("X");

                }
                else
                {
                    System.out.print(".");
                }
            }

            System.out.print("\n");
        }
        Sc.close();
    }    
}
