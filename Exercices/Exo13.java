package Exercices;
import java.util.Scanner;

public class Exo13 
{
    public static void main(String[]args)
    {
        Scanner Sc = new Scanner(System.in);
        int Tc;
        Float Tm;

        System.out.println("Donner une taille en centimètre ?");
        Tc = Sc.nextInt();

        Tm = (float) (Tc)/100;
        
        System.out.println(Tc + " cm vaut " + Tm + " m.");
        Sc.close();
    }
}
