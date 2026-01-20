package Entrainement;

import java.util.Scanner;

public class TabTriebulle 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        String user;
        String [][] tstrings = new String[26][2];
        int occuranceI;
        int tempoc;
        char lettreC='a';
        char tempchar;
        boolean trie = true;
        
        do
        {
            System.out.print("\nEntrer un texte de 120 caractères minimum\n> ");
            user = sc.nextLine().toLowerCase();
        }
        while(user.length()<120);
        sc.close();

        user = TabTriebulle.replaceChar(user);

        for(int i = 0;i<tstrings.length;i++)
        {
            tstrings[i][0] = Character.toString(lettreC);
            lettreC++; 
        }

        for(int j = 0; j < tstrings.length; j++) 
        {
            tstrings[j][1] = "0";
        }

        for(int i = 0;i<user.length();i++)
        {
            for(int j =0;j<tstrings.length;j++)
            {
                if(tstrings[j][0].charAt(0) == user.charAt(i))
                    {
                        occuranceI = Integer.parseInt(tstrings[j][1]);
                        occuranceI++;
                        tstrings[j][1] = Integer.toString(occuranceI); 
                    }
            }
        }
        
        while (trie) 
        {
            trie=false;
            for(int i=0;i<tstrings.length-1;i++)
            {
                if(Integer.parseInt(tstrings[i][1])>Integer.parseInt(tstrings[i+1][1]))
                {
                    trie = true;
                    tempchar = tstrings[i][0].charAt(0);
                    tempoc = Integer.parseInt(tstrings[i][1]);

                    tstrings[i][0] = tstrings[i+1][0];
                    tstrings[i][1] = tstrings[i+1][1];
                    tstrings[i+1][0] = Character.toString(tempchar);
                    tstrings[i+1][1] = Integer.toString(tempoc);
                }
            }
        }
        for(int i = 0;i<tstrings.length;i++)
        {
            System.out.println(tstrings[i][0]+" : "+tstrings[i][1]);
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
