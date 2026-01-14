package Entrainement;
import java.util.Random;
import java.util.Scanner;

public class Snake
{
    static int dim = 11;
    static int faceX = 5;
    static int faceY = 5;
    static int pommeX,pommeY;
    static String blueC_BG = "\033[48;2;173;216;230m ";
    static String blueR_BG = "\033[48;2;65;105;225m ";
    static String RESET = "\033[0m";
    public static void main(String[]args)
    {
        while (true) 
        {
            Dammier();
            SerpentF();
            Pomme();
            Dep();
        }

    }
    // Déplacemnt
    public static void Dep()
    {
        Scanner sc = new Scanner(System.in);
        char dep;

        System.out.print("\033[s");
        System.out.print("\033[22;94HDéplacemment avec (z, q, s, d)");
        System.out.print("\033[23;94H> ");
        dep = sc.nextLine().charAt(0);
        
        switch (dep) 
        {
            case 'z':
                faceY--;
                break;
        
            case 'q':
                faceX--;

                break;
            case 's':
                faceY++;
                break;
            case 'd':
                faceX++;
                break;
        }
        System.out.print("\033[u");
    }

    // Affichage tête Serpent
    public static void SerpentF()
    {
        System.out.print("\033[s");
        System.out.print("\033["+(faceY*4+2)+";"+(faceX*8+3)+"H"+"\033[38;2;0;198;79m████");
        System.out.print("\033["+(faceY*4+3)+";"+(faceX*8+3)+"H"+"\033[38;2;0;198;79m████");
        System.out.print("\033[u");  
    }

    // Affichage d'une pomme
    public static void Pomme()
    {
        Random rdm = new Random();
        pommeX = rdm.nextInt(11);
        pommeY = rdm.nextInt(11);

        System.out.print("\033[s");
        System.out.print("\033["+(pommeY*4+2)+";"+(pommeX*8+3)+"H"+"\033[38;2;255;0;0m████");
        System.out.print("\033["+(pommeY*4+3)+";"+(pommeX*8+3)+"H"+"\033[38;2;255;0;0m████");
        System.out.print("\033[u");                                  
    }

    // Affichage du Dammier
    public static void Dammier()
    {
        System.out.print("\033[2J\033[H");
        for(int y=0;y<dim;y++)
        {
            for(int i=0;i<4;i++)
            {
                for(int x=0;x<dim;x++)
                {
                    if((y+x)%2 == 0)
                    {
                        System.out.print(blueC_BG+blueC_BG+blueC_BG+blueC_BG+blueC_BG+blueC_BG+blueC_BG+blueC_BG);
                    }
                    else
                    {
                        System.out.print(blueR_BG+blueR_BG+blueR_BG+blueR_BG+blueR_BG+blueR_BG+blueR_BG+blueR_BG);
                    }
                }
                System.out.print(RESET);
                System.out.println();
            }
        }
    }    
}
