package ExerciceP1Bis;
import java.util.Scanner;

public class Exercice3_6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String motC;
        char x;
        boolean[]tab;
        boolean good = false;
        int essaie = 6;
        int gagne = 2;

        System.out.print("\nEntrer le mot à trouver (minimum 5 lettres)\n> ");
        motC = sc.nextLine();

        tab= new boolean[motC.length()];
        tab[0]= true;
        tab[tab.length-1]= true;

        if(motC.length()>=5)
        {
            while (true) 
            {  
                if(gagne == motC.length())
                {
                    System.out.println("gg");
                    break;
                }
                else if(essaie==0)
                {
                    System.out.println("perdue");
                    break;
                }
                else
                {
                    for(int i=0;i<motC.length();i++)
                    {
                        if(tab[i])
                        {
                            System.out.print(motC.charAt(i));
                        }
                        else
                        {
                            System.out.print("-");
                        }
                    }

                    System.out.print("\nEntrer une lettre (reste essaie "+essaie+")\n> ");
                    x = sc.next().charAt(0);

                    for(int i=1;i<motC.length()-1;i++)
                    {
                        if(x == motC.charAt(i)&&!tab[i])
                        {
                            tab[i]=true;
                            gagne++;
                            good = true;
                        }
                    }
                    if(!good)
                    {
                        essaie--;
                    }
                }
                good=false;    
            }
        }
        else
        {
            System.out.println("le mot ne fais pas 5 lettre");
        }
    }    
}
