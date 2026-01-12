package ExerciceP1;
import java.util.Scanner;
import java.util.ArrayList;
import Outils.ScannersTypes;

public class Exo2_6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        ArrayList<Integer>nD = new ArrayList<>();

        System.out.print("Choisir un nombre\n> ");
        ScannersTypes.INT(sc);
        n = sc.nextInt();

        for(int i = 1;i<=n;i++)
        {
            if(n%i==0)
            {
                nD.add(i);
            }
        }
        if (nD.size()==2) 
        {
            System.out.print(n+" est un nombre premier.");
        }
        else
        {
            System.out.print(n+" n'est pas un nombre premier.");
        }
        sc.close();
    }
}
