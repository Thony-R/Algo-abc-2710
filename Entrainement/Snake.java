package Entrainement;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Snake
{
    static int dim = 11;
    static int faceX = 5;
    static int faceY = 5;
    static int lFaceX = faceX;
    static int lFaceY = faceY;

    static int pommeX,pommeY;
    static ArrayList<int[]>PCorps= new ArrayList<>();
    static int [][]Temp;
    static String blueC_BG = "\033[48;2;173;216;230m ";
    static String blueR_BG = "\033[48;2;65;105;225m ";
    static String RESET = "\033[0m";
    public static void main(String[]args)
    {
        System.out.print("\033\143");
        PPomme();
        boolean jeux = true;
        while (jeux) 
        {
            Dammier();
            DPomme();
            System.out.print("\033[s");
            System.out.print("\033[38;2;0;255;0m\033[20;94HScore : "+PCorps.size());
            System.out.print("\033[u"); 
            CSerpent();
            SerpentF();
            Dep();
            if(faceY<0 || faceX<0 || faceX>=dim|| faceY>=dim)
            {
                jeux = false;
            }
            for(int i =0;i<PCorps.size();i++)
            {
                if(PCorps.get(i)[0]==faceX && PCorps.get(i)[1]==faceY)
                {
                    jeux = false;
                }
            }
            if(pommeX == faceX && pommeY == faceY)
            {   
                PCorps.add(new int[]{lFaceX,lFaceY});
                PPomme();  
            }
        }
        System.out.println("perdue");

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
                if(i==0)
                {

                    PCorps.get(i)[0] = lFaceX;
                    PCorps.get(i)[1] = lFaceY;
                }

                else
                {
                    PCorps.get(i)[0] = Temp[i-1][0];
                    PCorps.get(i)[1] = Temp[i-1][1]; 
                }
                System.out.print("\033[s");
                System.out.print("\033["+(PCorps.get(i)[1]*4+2)+";"+(PCorps.get(i)[0]*8+3)+"H"+"\033[38;2;0;198;79m████");
                System.out.print("\033["+(PCorps.get(i)[1]*4+3)+";"+(PCorps.get(i)[0]*8+3)+"H"+"\033[38;2;0;198;79m████");
                System.out.print("\033[u");
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
        boolean pValide=true;

        do 
        {
            pommeX = rdm.nextInt(dim);
            pommeY = rdm.nextInt(dim);

            for(int i =0;i<PCorps.size();i++)
            {
                if(PCorps.get(i)[0]==pommeX && PCorps.get(i)[1]==pommeY)
                {
                    pValide=false;
                    break;
                }
            }

            if(pommeX == faceX && pommeY == faceY)
            {
                pValide=false;
                continue;
            }  
        } while (pValide);

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
        System.out.print("\033[1;1H");
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
