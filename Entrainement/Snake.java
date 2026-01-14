package Entrainement;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Snake
{
    static int dim = 11;
    static int faceX = 5;
    static int faceY = 5;
    static int lFaceX, lFaceY,tempX,tempY;
    static int pommeX,pommeY;
    static ArrayList<int[]>PCorps= new ArrayList<>();
    static int [][]Temp;
    static String blueC_BG = "\033[48;2;173;216;230m ";
    static String blueR_BG = "\033[48;2;65;105;225m ";
    static String RESET = "\033[0m";
    public static void main(String[]args)
    {
        PPomme();
        while (true) 
        {
            Dammier();
            DPomme();
            if(pommeX == faceX && pommeY == faceY)
            {   CSerpent();
                PPomme();  
            }
            CSerpent();
            SerpentF();
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

        lFaceX = faceX;
        lFaceY = faceY;
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
    // affichage Corp Serpent
    public static void CSerpent()
    {
        if(pommeX == faceX && pommeY == faceY)
        {
            PCorps.add(new int []{lFaceX,lFaceY});
            PCorps.get(PCorps.size()-1);
        }

        if(PCorps.size()>0)
        {
            Temp=new int[PCorps.size()][2];

            for(int i=0;i<PCorps.size();i++)
            {
                Temp[i][0] = PCorps.get(i)[0];
                Temp[i][1] = PCorps.get(i)[1];
            }

            for(int i = PCorps.size()-1;i>=0;i--)
            {
                if(lFaceX != PCorps.get(i)[0]||lFaceY!= PCorps.get(i)[1])
                {

                    PCorps.get(i)[0] = lFaceX;
                    PCorps.get(i)[1] = lFaceY;

                    System.out.print("\033[s");
                    System.out.print("\033["+(PCorps.get(i)[1]*4+2)+";"+(PCorps.get(i)[0]*8+3)+"H"+"\033[38;2;0;198;79m████");
                    System.out.print("\033["+(PCorps.get(i)[1]*4+3)+";"+(PCorps.get(i)[0]*8+3)+"H"+"\033[38;2;0;198;79m████");
                    System.out.print("\033[20;94HScore : "+PCorps.size());
                    System.out.print("\033[u"); 
                }

                else if(i != PCorps.size()-1)
                {
                    PCorps.get(i)[0] = Temp[i][0];
                    PCorps.get(i)[1] = Temp[i][1];
                    System.out.print("\033[s");
                    System.out.print("\033["+(PCorps.get(i)[1]*4+2)+";"+(PCorps.get(i)[0]*8+3)+"H"+"\033[38;2;0;198;79m████");
                    System.out.print("\033["+(PCorps.get(i)[1]*4+3)+";"+(PCorps.get(i)[0]*8+3)+"H"+"\033[38;2;0;198;79m████");
                    System.out.print("\033[20;94HScore : "+PCorps.size());
                    System.out.print("\033[u"); 
                }
            }
        }
    }
    // Affichage tête Serpent
    public static void SerpentF()
    {
        System.out.print("\033[s");
        System.out.print("\033["+(faceY*4+2)+";"+(faceX*8+3)+"H"+"\033[38;2;0;198;79m████");
        System.out.print("\033["+(faceY*4+3)+";"+(faceX*8+3)+"H"+"\033[38;2;0;198;79m████");
        System.out.print("\033[u"); 
    }
    // position pomme
    public static void PPomme()
    {
        Random rdm = new Random();
        pommeX = rdm.nextInt(dim);
        pommeY = rdm.nextInt(dim);
    }

    // Affichage d'une pomme
    public static void DPomme()
    {
        System.out.print("\033[s");
        System.out.print("\033["+(pommeY*4+2)+";"+(pommeX*8+3)+"H"+"\033[38;2;255;0;0m████");
        System.out.print("\033["+(pommeY*4+3)+";"+(pommeX*8+3)+"H"+"\033[38;2;255;0;0m████");
        System.out.print("\033[u");                                  
    }

    // Affichage du Dammier
    public static void Dammier()
    {
        System.out.print("\033\143");
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
