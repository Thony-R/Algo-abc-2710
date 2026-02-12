package Entrainement.Voiture_exos.Véhicules;

public class VoitureDeCourse extends Voiture
{
    private VoitureDeCourse(String _marque, String _model,int _poids,Moteur _moteur)
    {
        super(_marque,_model,_poids,_moteur);        
    }

    public static VoitureDeCourse creation(String _marque, String _model,int _poids,Moteur _moteur)
    {
        if(_marque.equals(_moteur.getMarque()))
        {
           return new VoitureDeCourse(_marque,_model,_poids,_moteur);
        }
        return null;
    }
    public String vitesseMax()
    {
        int vMax = this.moteur.vMax - (int) (this.poids * 0.05);

        return this.toString()+". Vitesse max : "+vMax+" Km/h";
    }
}
