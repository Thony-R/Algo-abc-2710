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
        }
        while(user.length()<120);
        sc.close();
        user = Exo3_3.replaceChar(user);
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
    static String replaceChar(String chaine)
    {
        chaine = chaine.replace('â', 'a');
        chaine = chaine.replace('à', 'a');
        chaine = chaine.replace('ä', 'a');

        chaine = chaine.replace('é', 'e');
        chaine = chaine.replace('è', 'e');
        chaine = chaine.replace('ê', 'e');
        chaine = chaine.replace('ë', 'e');

        chaine = chaine.replace('î', 'i');
        chaine = chaine.replace('ï', 'i');

        chaine = chaine.replace('ô', 'o');
        chaine = chaine.replace('ö', 'o');

        chaine = chaine.replace('ù', 'u');
        chaine = chaine.replace('û', 'u');
        chaine = chaine.replace('ü', 'u');

        chaine = chaine.replace('ç', 'c');

        chaine = chaine.replace('ÿ', 'y');

        return chaine;
    }
}

