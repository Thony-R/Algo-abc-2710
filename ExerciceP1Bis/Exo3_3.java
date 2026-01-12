package ExerciceP1Bis;
import java.util.Scanner;

public class Exo3_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String user;
        char[]lettres = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[]occurence= new int[26];

        System.out.print("\nEntrer un texte de 120 caractères minimum\n> ");
        user = sc.nextLine().toLowerCase();
        sc.close();

        if(user.length() >= 120)
        {
            for(int i = 0; i < user.length();i++)
            {
                for(int j=0;j<lettres.length;j++) 
                {
                    if (lettres[j]==user.charAt(i)) 
                    {
                        occurence[j]++;
                    }
                }
            } 
        
            for(int t =0;t<lettres.length;t++)
            {
                System.out.println(lettres[t]+" "+occurence[t]);
            }
        }

        else
        {
            System.out.println("Vous n'avez pas entré 120 caractère");
        }


    }
}
