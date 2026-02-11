package Entrainement.fraction;

public class Fraction 
{
    //Attribut
    private int numerateur;
    private int denominateur;

    //Constructeur
    public Fraction(int _numerateur,int _denominateur)
    {
        this.denominateur=_denominateur;
        this.numerateur=_numerateur;
        reduire();
    }
    public Fraction()
    {
        this.denominateur=1;
    }
    public Fraction(int _numerateur)
    {
        this.denominateur=1;
        this.numerateur=_numerateur;
    }

    //Getter
    public int getDenominateur()
    {
        return this.denominateur;
    }
    public int getNumerateur()
    {
        return this.numerateur;
    }

    //Metode
    public void Oppose()
    {
        this.numerateur=-this.numerateur;
    }

    public void Inverse()
    {
        int temp=this.denominateur;
        this.denominateur=this.numerateur;
        this.numerateur=temp;
    }

    public boolean Superieur(Fraction _uneFraction)
    {
        if(this.denominateur>_uneFraction.denominateur && this.numerateur > _uneFraction.numerateur)
        {
            return true;
        }

        return false;
    }
    public boolean Inferieur(Fraction _uneFraction)
    {
        if(this.denominateur<_uneFraction.denominateur && this.numerateur < _uneFraction.numerateur)
        {
            return true;
        }
        return false;
    }
    public boolean Egal(Fraction _uneFraction)
    {
        if(this.denominateur==_uneFraction.denominateur && this.numerateur == _uneFraction.numerateur)
        {
            return true;
        }
        return false;
    }

    private int getPGCD()
    {
        int a = this.numerateur;
        int b = this.denominateur;
        int pgcd=-1;
        if ( a!=0 && b!=0)
        {
            if ( a<0 )
            {
                a =-a;
            }
                
            if ( b<0 )
            {
                b =-b;
            } 
            while ( a!=b )
            {
                if ( a<b )
                {
                    b -= a;
                } 
                else
                {
                    a -=b;
                }  
            }
            pgcd = a;
        }
        return pgcd;
    }

    private void reduire()
    {
        int pgcd = getPGCD();
        this.denominateur/=pgcd;
        this.numerateur/=pgcd;
        if(this.denominateur<0)
        {
            this.numerateur = - this.numerateur;
            this.denominateur = -this.denominateur;

        }
    }

    //Opeération
    public Fraction somme(Fraction _fraction)
    {
        int newNum = this.numerateur*_fraction.getDenominateur()+this.denominateur*_fraction.getNumerateur();
        int newDen = this.denominateur*_fraction.getDenominateur();
        Fraction newF= new Fraction(newNum,newDen);
        return newF; 
    }
    public Fraction difference(Fraction _fraction)
    {
        int newNum = this.numerateur*_fraction.getDenominateur()-this.denominateur*_fraction.getNumerateur();
        int newDen = this.denominateur*_fraction.getDenominateur();
        Fraction newF= new Fraction(newNum,newDen);
        return newF;         
    }
    public Fraction produit(Fraction _fraction)
    { 
        int newNum = this.numerateur*_fraction.getNumerateur();
        int newDen = this.denominateur*_fraction.getDenominateur();
        Fraction newF= new Fraction(newNum,newDen);
        return newF;      
    }
    public Fraction quotient(Fraction _fraction)
    {
        int newNum = this.numerateur*_fraction.getDenominateur();
        int newDen = this.denominateur*_fraction.getNumerateur();
        Fraction newF= new Fraction(newNum,newDen);
        return newF;
    }
    public Fraction pussance(int _exposant)
    {
        int newNum = (int) Math.pow(this.numerateur, _exposant);
        int newDen = (int) Math.pow(this.denominateur, _exposant);
        Fraction newF = new Fraction(newNum,newDen);
        return newF;
    }
}
