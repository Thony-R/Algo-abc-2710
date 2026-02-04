package Entrainement.Compte;

public class CompteE extends Compte
{
    private double tauxInteret;


    public CompteE(String _nom,double _solde,double _decouvert,double _tauxIntert)
    {
        super(_nom,_solde,_decouvert);
        this.tauxInteret=_tauxIntert;
    }
    public CompteE()
    {

    }

    public double getTauxInteret()
    {
        return this.tauxInteret;
    }
    public void setTauxInteret(double _newTaux)
    {
        this.tauxInteret=_newTaux;
    }
    public String toString()
    {
        return super.toString()+ "taux d'interet : "+(this.tauxInteret*100)+" %";
    }
    public double calculIntert(double[] _tableaux)
    {
        double sommeInteret =0;
        for(double solde : _tableaux)
        {
            sommeInteret += (solde*tauxInteret)/24;
        }

        return sommeInteret;
    }
}