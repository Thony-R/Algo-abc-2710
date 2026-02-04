package Entrainement.Compte;

public class Banque 
{
    private int NbComptes; 
    private Compte[]LesComptes;

    public Banque()
    {
        LesComptes =  new Compte[20];
        this.NbComptes=0;
    }
    public void Init()
    {
        Compte c1 = new Compte("toto",1000,-500);
        Compte c2 = new Compte("titi",2000,-1000);
        Compte c3 = new Compte("dupond",1500,-1500);
        Compte c4 = new Compte("durand",1200,-500);
        Compte c5 = new Compte("dubois",-200,-500);
        Compte c6 = new Compte("duval",750,-2000);
        this.ajouteCompte(c1);
        this.ajouteCompte(c2);
        this.ajouteCompte(c3);
        this.ajouteCompte(c4);
        this.ajouteCompte(c5);
        this.ajouteCompte(c6);
    }
    private void ajouteCompte(Compte unCompte)
    {
        LesComptes[NbComptes++]=unCompte;
    }
    public void AfficherComptes()
    {
        for(int i=0;i<NbComptes;i++)
        {
            System.out.println();
            System.out.println(LesComptes[i].toString());
        }
    }
    public void AjouteCompte(String _nom,double _solde,double _dec)
    {
        LesComptes[NbComptes++]=new Compte(_nom,_solde,_dec);
    }
    public Compte CompteSup()
    {
        boolean permutation=true;
        Compte []copieTab = LesComptes;
        while(permutation)
        {
            permutation= false;
            for(int i=0;i<NbComptes-1;i++)
            {
                if(copieTab[i].getSolde()<copieTab[i+1].getSolde())
                {
                    permutation=true;

                    Compte temp=copieTab[i];
                    copieTab[i] = copieTab[i+1];
                    copieTab[i+1]= temp;
                }
            }
        }
        return copieTab[0];
    }
    public Compte RendCompte(int _NumCompte)
    {
        for(int i=0;i<NbComptes;i++)
        {
            if(_NumCompte==LesComptes[i].getNumCompte())
            {
                return LesComptes[i];
            }
        }
 
        return null;
    }
    public boolean Transfert(int _NumCompteE,int _NumCompteR,double _Montant)
    {
        Compte a =RendCompte(_NumCompteE);
        Compte b = RendCompte(_NumCompteR);

        if(a.transfert(b, _Montant))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
