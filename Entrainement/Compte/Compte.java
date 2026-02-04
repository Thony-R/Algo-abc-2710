package Entrainement.Compte;
import java.time.LocalDateTime;


public class Compte 
{
    public int numCompte;
    protected String nom;
    protected double solde;
    protected double decouvertAutorise;

    //constructeur
    public Compte()
    {
        this.numCompte = id();
        this.nom = "sans nom";
        this.solde = 0;
        this.decouvertAutorise = 0;
    }

    public Compte(String _nom, double _solde,double _decouvertAutorise)
    {
        this.numCompte = id();
        this.nom = _nom;
        this.solde = _solde;
        this.decouvertAutorise = _decouvertAutorise;
    }

    // getters && setters
    public void setSolde(double _newSolde)
    {
        this.solde = _newSolde;
    }
    public int getNumCompte()
    {
        return numCompte;
    }
    public String getNom()
    {
        return nom;
    }
    public double getSolde()
    {
        return solde;
    }

    //affichage de l'Objet
    public String toString()
    {
        return "\t|   Compte  |\n\nNuméro de compte : "+this.numCompte+"\nNom : "+this.nom+"\nSolde : "+this.solde+"\nDécouvert autorisé : "+this.decouvertAutorise;
    }

    //Génération du num de Compte
    public int id()
    {
        LocalDateTime maintenant = LocalDateTime.now();
        int id = Math.abs(maintenant.hashCode());
        return id;
    }
    
    // Créditer le compte
    public void crediter(double _newVal)
    {
        this.solde += _newVal;
    }
    // Débiter le compte
    public boolean debiter(double _newVal)
    {
        boolean essay = verif(_newVal);
        if(essay)
        {
            this.solde-= _newVal;
        }
        return essay;
    }

    // Transfert
    public boolean transfert(Compte _autreCompte,double _transfert)
    {
        boolean essay = verif(_transfert);
        if(essay)
        {
            this.solde-=_transfert;
            _autreCompte.crediter(_transfert);;
        }

        return essay;
    }
    
    // Verification de transfert ou de débit
    public boolean verif(double _val)
    {
        boolean possible;
        if(this.solde - _val>=this.decouvertAutorise)
        {
            possible = true;
        }
        else
        {
            possible = false;
        }
        return possible;
    }

    public boolean superieur(Compte _autreCompte)
    {
        boolean sup;
        if(this.solde >= _autreCompte.solde)
        {
            sup = true;
        }
        else
        {
            sup = false;
        }

        return sup;
    }
}
