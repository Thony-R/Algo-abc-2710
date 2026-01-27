package Entrainement;

public class Plateaux 
{
    static String blackP = "\033[48;2;0;0;0m";
    static String whiteP = "\033[48;2;255;255;255m";
    static String reset = "\033[0m";
    public static void main(String[] args) 
    {
        int x = 8;
        int y = 8;
        System.out.println("\033\143");
        System.out.println();
        for(int i = 0;i<y;i++)
        {
            for(int k =0;k<4;k++)
            {
                for(int j=0;j<x;j++)
                {
                    if((i+j)%2==0)
                    {
                        System.out.print(blackP+"        ");
                    }
                    else
                    {
                        System.out.print(whiteP+"        ");
                    }
                }

                System.out.println(reset);

            }
        }
    }

}
