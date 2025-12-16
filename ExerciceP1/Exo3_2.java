package ExerciceP1;
import java.util.Scanner;
import Outils.ScannersTypes;

public class Exo3_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int s;
        int m = 0;

        System.out.print("\nQuel est le montants de départ ?\n> ");
        ScannersTypes.INT(sc);
        s = sc.nextInt();
        
        while (s>0) 
        {
            s = s-(s/2+1);
            m++;
        }
        System.out.print("\nLe nombre de magasins dans lesquels il a acheté est de "+m);
        sc.close();
    }
}
