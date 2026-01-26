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
    
    static int pommeX, pommeY;
    static ArrayList<int[]> PCorps = new ArrayList<>();
    static int[][] Temp;
    static String blueC_BG = "\033[48;2;173;216;230m ";
    static String blueR_BG = "\033[48;2;65;105;225m ";
    static String RESET = "\033[0m";
    static char lastDirection = 'd'; // Direction par défaut (droite)
    
    public static void main(String[] args)
    {
        System.out.print("\033\143"); // Efface l'écran
        PPomme();
        boolean jeux = true;
        Scanner sc = new Scanner(System.in);
        
        while (jeux) 
        {
            // Rafraîchir l'écran
            System.out.print("\033\143");
            
            Dammier();
            DPomme();
            CSerpent();
            SerpentF();
            
            // Affichage du score et instructions
            System.out.print("\033[s");
            System.out.print("\033[38;2;0;255;0m\033[20;94HScore : " + PCorps.size());
            System.out.print("\033[22;94HDéplacement avec (z, q, s, d)");
            System.out.print("\033[23;94H> ");
            System.out.print("\033[u");
            
            // Lecture de l'entrée utilisateur (non-bloquante)
            Dep();
            
            // Vérification si la pomme est mangée AVANT de déplacer le corps
            if(pommeX == faceX && pommeY == faceY)
            {   
                // Ajouter un nouveau segment
                if(PCorps.size() == 0) {
                    PCorps.add(new int[]{lFaceX, lFaceY});
                } else {
                    int[] dernier = PCorps.get(PCorps.size() - 1);
                    PCorps.add(new int[]{dernier[0], dernier[1]});
                }
                PPomme(); // Générer une nouvelle pomme
            }
            
            // Conditions de fin de jeu
            if(faceY < 0 || faceX < 0 || faceX >= dim || faceY >= dim)
            {
                jeux = false;
            }
            
            // Vérifier collision avec le corps
            for(int i = 0; i < PCorps.size(); i++)
            {
                if(PCorps.get(i)[0] == faceX && PCorps.get(i)[1] == faceY)
                {
                    jeux = false;
                }
            }
            
            try {
                Thread.sleep(500); // Pause pour rendre le jeu jouable
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Écran de fin de jeu
        System.out.print("\033\143");
        System.out.println("\n\n╔══════════════════════════════════════╗");
        System.out.println("║           GAME OVER!                ║");
        System.out.println("║       Score final : " + PCorps.size() + "              ║");
        System.out.println("╚══════════════════════════════════════╝\n");
        sc.close();
    }
    
    // Déplacement avec mouvement automatique
    public static void Dep()
    {
        try {
            // Vérifier si une touche est pressée
            if(System.in.available() > 0) {
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                if(input.length() > 0) {
                    char dep = input.charAt(0);
                    
                    // Mettre à jour la direction seulement si elle n'est pas opposée
                    switch(dep) {
                        case 'z':
                            if(lastDirection != 's') lastDirection = 'z';
                            break;
                        case 'q':
                            if(lastDirection != 'd') lastDirection = 'q';
                            break;
                        case 's':
                            if(lastDirection != 'z') lastDirection = 's';
                            break;
                        case 'd':
                            if(lastDirection != 'q') lastDirection = 'd';
                            break;
                    }
                }
            }
            
            // Sauvegarder l'ancienne position
            lFaceX = faceX;
            lFaceY = faceY;
            
            // Déplacer selon la dernière direction
            switch(lastDirection) 
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
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Affichage Corps Serpent
    public static void CSerpent()
    {
        if(PCorps.size() > 0)
        {
            // Copie temporaire des positions
            Temp = new int[PCorps.size()][2];
            
            for(int i = 0; i < PCorps.size(); i++)
            {
                Temp[i][0] = PCorps.get(i)[0];
                Temp[i][1] = PCorps.get(i)[1];
            }
            
            // Déplacer chaque segment
            for(int i = PCorps.size() - 1; i >= 0; i--)
            {
                if(i == 0)
                {
                    // Premier segment suit l'ancienne position de la tête
                    PCorps.get(i)[0] = lFaceX;
                    PCorps.get(i)[1] = lFaceY;
                }
                else
                {
                    // Les autres segments suivent le segment précédent
                    PCorps.get(i)[0] = Temp[i-1][0];
                    PCorps.get(i)[1] = Temp[i-1][1]; 
                }
            }
            
            // Affichage de tous les segments
            for(int i = 0; i < PCorps.size(); i++)
            {
                System.out.print("\033[s");
                System.out.print("\033[" + (PCorps.get(i)[1]*4+2) + ";" + (PCorps.get(i)[0]*8+3) + "H" + "\033[38;2;0;198;79m████");
                System.out.print("\033[" + (PCorps.get(i)[1]*4+3) + ";" + (PCorps.get(i)[0]*8+3) + "H" + "\033[38;2;0;198;79m████");
                System.out.print("\033[u");
            }
        }
    }
    
    // Affichage tête Serpent
    public static void SerpentF()
    {
        System.out.print("\033[s");
        System.out.print("\033[" + (faceY*4+2) + ";" + (faceX*8+3) + "H" + "\033[38;2;0;255;0m████");
        System.out.print("\033[" + (faceY*4+3) + ";" + (faceX*8+3) + "H" + "\033[38;2;0;255;0m████");
        System.out.print("\033[u"); 
    }
    
    // Position pomme
    public static void PPomme()
    {
        Random rdm = new Random();
        boolean pValide = false;
        
        // Continuer jusqu'à trouver une position valide
        while (!pValide) 
        {
            pValide = true;
            pommeX = rdm.nextInt(dim);
            pommeY = rdm.nextInt(dim);
            
            // Vérifier que la pomme n'est pas sur la tête
            if(pommeX == faceX && pommeY == faceY) {
                pValide = false;
                continue;
            }
            
            // Vérifier que la pomme n'est pas sur le corps
            for(int i = 0; i < PCorps.size(); i++)
            {
                if(PCorps.get(i)[0] == pommeX && PCorps.get(i)[1] == pommeY)
                {
                    pValide = false;
                    break;
                }
            }
        }
    }
    
    // Affichage d'une pomme
    public static void DPomme()
    {
        System.out.print("\033[s");
        System.out.print("\033[" + (pommeY*4+2) + ";" + (pommeX*8+3) + "H" + "\033[38;2;255;0;0m████");
        System.out.print("\033[" + (pommeY*4+3) + ";" + (pommeX*8+3) + "H" + "\033[38;2;255;0;0m████");
        System.out.print("\033[u");                                  
    }
    
    // Affichage du Damier
    public static void Dammier()
    {
        System.out.print("\033[1;1H");
        for(int y = 0; y < dim; y++)
        {
            for(int i = 0; i < 4; i++)
            {
                for(int x = 0; x < dim; x++)
                {
                    if((y + x) % 2 == 0)
                    {
                        System.out.print(blueC_BG + blueC_BG + blueC_BG + blueC_BG + blueC_BG + blueC_BG + blueC_BG + blueC_BG);
                    }
                    else
                    {
                        System.out.print(blueR_BG + blueR_BG + blueR_BG + blueR_BG + blueR_BG + blueR_BG + blueR_BG + blueR_BG);
                    }
                }
                System.out.print(RESET);
                System.out.println();
            }
        }
    }
}