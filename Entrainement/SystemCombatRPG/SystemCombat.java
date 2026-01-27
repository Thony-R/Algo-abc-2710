package Entrainement.SystemCombatRPG;

public class SystemCombat 
{
    static public class Personnage
    {
        protected  String nom;
        protected String classe;
        protected int pv;
        protected int force;

        // Constructeur
        public Personnage()
        {
            this.nom = "Sans nom";
            this.classe = "Sans Métier";
            this.pv = 0;
            this.force = 0;
        }
        public Personnage(String _nom,String _classe)
        {
            this.nom = _nom;
            this.classe = _classe;
            this.pv = 100;
            this.force = 10;
        }
        //Getter
        public String getNom()
        {
            return this.nom;
        }
        public int getPv()
        {
            return this.pv;
        }

        //Métode Verif vivant
        public boolean vivant()
        {
            if(this.pv<=0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        //Attaque
        public void attaque(Personnage _joueur2)
        {
            _joueur2.receptDegat(this.force);
        }

        //reception des dégat
        public void receptDegat(int _degatBrut)
        {
            this.pv -= _degatBrut;            
            
            if(vivant() == false)
            {
                this.pv = 0;
            }

            System.out.println(this.getNom()+" perd "+ _degatBrut+" PV. (Reste : "+this.getPv()+")");
        }
    }

    // Métier Guerrier
    static public class Guerrier extends Personnage
    {
        private int armure;

        public Guerrier(String _nom,int _shield)
        {
            super(_nom,"Guerrier");
            this.armure = _shield;
        }
        
        public String toString()
        {
            return this.getNom()+" "+this.classe+" "+this.getPv();
        }
        public void receptDegat(int _degatBrut)
        {
            double degatReduc = _degatBrut - (_degatBrut*(this.armure/2.0)/100.0);
            int degatFinal = (int) degatReduc;

            super.receptDegat(degatFinal);
        }
    }

    // Métier Mage
    static public class Mage extends Personnage
    {
        private int mana;

        public Mage(String _nom,int _mana)
        {
            super(_nom,"Mage");
            this.mana = _mana;
        }

        public String toString()
        {
            return this.getNom()+" "+this.classe+" "+this.getPv()+" "+this.mana;
        }

        public void attaque(Personnage _joueur2)
        {
            int degatBrut= this.force*2;

            if(this.mana >= 10)
            {
                this.mana -= 10;
                _joueur2.receptDegat(degatBrut);
            }
            else
            {
                _joueur2.receptDegat(1);
            }
        }
    }
}
