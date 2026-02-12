package Entrainement.Voiture_exos;

import Entrainement.Voiture_exos.Véhicules.Moteur;
import Entrainement.Voiture_exos.Véhicules.Voiture;
import Entrainement.Voiture_exos.Véhicules.VoitureDeCourse;

public class App 
{
    public static void main(String[] args) 
    {
        Moteur m1 = new Moteur("bien",178);
        VoitureDeCourse v1= VoitureDeCourse.creation("bien","jesus",750,m1);
        Voiture voiture = new Voiture("Renault","clio",1150,m1); 
        System.out.println(v1.vitesseMax());
        System.out.println(voiture.toString()+". Vitesse max : "+voiture.vMaxVoiture()+" Km/h");
    }

    public static boolean verifObjCree(Object _unObjet)
    {
        if(_unObjet != null)
        {
            return true;
        }
        return false;
    }
}
