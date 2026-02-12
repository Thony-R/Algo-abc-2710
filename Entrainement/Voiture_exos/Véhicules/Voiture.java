package Entrainement.Voiture_exos.Véhicules;

public class Voiture 
{
    protected String marque;
    protected String model;
    protected int poids;
    protected Moteur moteur;
    
    //toString
    public String toString()
    {   
        return this.marque+" "+this.model+", "+this.poids+" Kg";
    }

    //Getter
    public String getMarque()
    {
        return this.marque;
    }
    public String getModel()
    {
        return this.model;
    }
    public int getPoids()
    {
        return this.poids;
    }

    //Setter
    public void setMarque(String _newMarque)
    {
        this.marque = _newMarque;
    }
    public void setModel(String _newModel)
    {
        this.model = _newModel;
    }
    public void setPoids(int _newPoids)
    {
        this.poids = _newPoids;
    }

    //Constructeur
    public Voiture()
    {
        this.marque = "Sans marque";
        this.model =  "Sans model";
        this.poids = 1000;
    }
    public Voiture(String _marque, String _model,Moteur _moteur)
    {
        this.marque = _marque;
        this.model = _model;
        this.poids = 1000;
        this.moteur = _moteur;
    }
    public Voiture(String _marque, String _model,int _poids,Moteur _moteur)
    {
        this.marque = _marque;
        this.model = _model;
        this.poids = _poids;    
        this.moteur = _moteur;    
    }

    //Metode Vmax voiture
    public int vMaxVoiture()
    {
        int vitesseMax = this.moteur.getVmax() - (int) (this.poids*0.3);
        return vitesseMax;
    }
}
