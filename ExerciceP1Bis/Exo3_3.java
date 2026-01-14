package ExerciceP1Bis;
import java.util.Scanner;

public class Exo3_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String user;
        char[]lettres = new char[26];
        int[]occurence= new int[26];

        do
        {
            System.out.print("\nEntrer un texte de 120 caractères minimum\n> ");
            user = sc.nextLine().toLowerCase();
            sc.close();
        }
        while(user.length()<120);

        user.replace('â', 'a');
        user.replace('à', 'a');
        user.replace('ä', 'a');

        user.replace('é', 'e');
        user.replace('è', 'e');
        user.replace('ê', 'e');
        user.replace('ë', 'e');

        user.replace('î', 'i');
        user.replace('ï', 'i');

        user.replace('ô', 'o');
        user.replace('ö', 'o');

        user.replace('ù', 'u');
        user.replace('û', 'u');
        user.replace('ü', 'u');

        user.replace('ç', 'c');

        user.replace('ÿ', 'y');

        char lettre = 'a';
        for(int i =0;i<lettres.length;i++)
        {
            lettres[i]=lettre;
            lettre++;
        }

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
}
