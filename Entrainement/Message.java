package Entrainement;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String VotreNom;

        System.out.println("Quel est votre nom ?");
        VotreNom = sc.nextLine();
        System.out.println("Bonjour " + VotreNom +  ", enchanté !");
        sc.close();
 }
}
