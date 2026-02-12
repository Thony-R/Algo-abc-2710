package Entrainement.Voiture_exos.Véhicules;

public class Moteur 
{
    protected String marque;
    protected int vMax;
    
    //Getter
    public String getMarque()
    {
        return this.marque;
    }
    public int getVmax()
    {
        return this.vMax;
    }
    //Setter
    public void setMarque(String _newMarque)
    {
        this.marque = _newMarque;
    }
    public void setVmax(int _newVmax)
    {
        this.vMax = _newVmax;
    }

    //Constructeur
    public Moteur()
    {
        this.marque = "Sans marque";
        this.vMax = 0;
    }
    public Moteur(String _marque,int _vMax)
    {
        this.marque = _marque; 
        this.vMax = _vMax;
    }
}
