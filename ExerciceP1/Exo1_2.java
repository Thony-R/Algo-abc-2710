package ExerciceP1;
import java.util.Scanner;
import Outils.*;

public class Exo1_2 
{
    public static void main(String[] args) 
    {

        // Déclaration de Variable
        double aire, volume,rayon;
        
        // Initialisation du Scanner
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer le rayon
        System.out.println("Quel et le rayon de la sphere ?");
        ScannersTypes.DOUBLE(sc);
        rayon = sc.nextDouble();

        // Calcule de son aire et du volume
        aire = 4*Math.PI*Math.pow(rayon, 2);
        //aire = Arrondi.arrondi(aire, 2);
        volume = (4.0/3.0)*Math.PI*Math.pow(rayon, 3);
        //volume = Arrondi.arrondi(volume, 2);

        System.out.println("L'aire de la sphere est de :"+aire);
        System.out.println("Le volume de la sphere est de :"+volume);
        sc.close();
    }
}
