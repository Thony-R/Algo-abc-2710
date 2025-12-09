package Entrainement;
import java.util.Scanner;

public class test {
    public static void main(String[]args)
    {
        String Question = "";
        Boolean UReponse,BReponse;
        int Score = 0;

        Scanner Sc = new Scanner(System.in);

        BReponse = false;
        for(int i=1; i<=5; i++)
        {
            switch (i) 
            {
                case 1:
                    Question="Question 1 : L'informatique a besoin des mathématiques ? (True/False)";
                    BReponse = true;
                    break;
                case 2:
                    Question="Question 2 : L'Algèbre de Boole a été inventé par Steve Jobs ? (True/False)";
                    BReponse = false;
                    break;
                case 3:
                    Question="Question 3 : En numération, la base de 10 va de 0 à 10 ? (True/False)";
                    BReponse = false;
                    break;
                case 4:
                    Question="Question 4 : Une table de vérité retourne l'expression algébrique (True/False)";
                    BReponse = true;
                    break;
                case 5:
                    Question="Question 5 : Git permet de stocker à distance son travail (True/False)";
                    BReponse = true;
                    break;
                default:
                    break;
            }

            System.out.println(Question);
            UReponse = Sc.nextBoolean();

            if (UReponse == BReponse) 
            {
                Score++;
            }
        }
        System.out.println("Résultat du QUIZZ, vous avez "+Score+" sur 5");
        Sc.close();
    }
}
