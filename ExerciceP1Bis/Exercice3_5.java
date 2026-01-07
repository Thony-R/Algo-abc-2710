package ExerciceP1Bis;
import java.util.Scanner;

public class Exercice3_5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String user,inversé="";
        char stock;
        System.out.print("\nEntrer une chaine de caractère\n> ");
        user = sc.nextLine();
        sc.close();

        user= user.replace(" ", "");

        for(int i=user.length()-1;i>=0;i--)
        {
            stock = user.charAt(i);
            inversé = inversé+ stock;
        }
        
        if(user.equals(inversé))
        {
            System.out.println("c'est un palindrome");
        }
        else
        {
            System.out.println("ce n'est pas un palindrome");
        }
    }
}
