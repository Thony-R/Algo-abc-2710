package Entrainement;

import java.util.Scanner;

public class Objet 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Point point = new Point();
        int vaX,vaY;

        // System.out.print("\nChoisir X\n> ");
        // vaX = sc.nextInt();
        // System.out.print("\nChoisir Y\n> ");
        // vaY=sc.nextInt();
        // System.out.println(point.getX()+", "+point.getY());
        // point.setX(vaX);
        // point.setY(vaY);

        // System.out.println(point.getX()+", "+point.getY());
        // point.permuter(point);
        // System.out.println("Permutation de X et De Y : "+point.getX()+", "+point.getY());
        // point.permuter(point);
        // System.out.println("Déplacer la coordonné X et Y");
        // vaX= sc.nextInt();
        // vaY = sc.nextInt();
        // point.seDeplacer(vaX, vaY);
        // System.out.println("Le point et a la position : "+point.getX()+", "+point.getY());
        // Point symApoint = point.symAbscisse();
        // System.out.println("la symetrie par rapport à l'abscisses est :"+symApoint.getX()+", "+symApoint.getY());
        // Point symOrpoint = point.symOrdonnees();
        // System.out.println("la symetrie par rapport à l'ordonnee est :"+symOrpoint.getX()+", "+symOrpoint.getY());
        // Point symOripoint = point.symOrigine();
        // System.out.println("la symetrie par rapport à l'ordonnee est :"+symOripoint.getX()+", "+symOripoint.getY());
       
        System.out.print("\nEntrez les coordonées de votre premier point\n> ");
        vaX=sc.nextInt();
        System.out.print("\n> ");
        vaY=sc.nextInt();

        point.setX(vaX);
        point.setY(vaY);

        Point sPoint = new Point();
        System.out.print("\nEntrez les coordonées de votre second point\n> ");
        vaX=sc.nextInt();
        System.out.print("\n> ");
        vaY=sc.nextInt();

        sPoint.setX(vaX);
        sPoint.setY(vaY);

        System.out.println("la distance entre les 2 point est de clear"+point.disPoint(sPoint));
        sc.close();
    }
    static public class Point 
    {
        private int X;
        private int Y;

        public int getX() 
        {
            return X;
        }
        public int getY()
        {
            return Y;
        }

        public void setX(int newVal)
        {
            this.X = newVal;
        }
        public void setY(int newVal)
        {
            this.Y= newVal;
        }


        public Point()
        {
            this.X=0;
            this.Y=0;
        }
        public Point(int _X,int _Y)
        {
            this.X= _X;
            this.Y= _Y;
        }

        public void permuter(Point unPoint)
        {
            int temp = this.Y;
            this.Y =this.X;
            this.X = temp;
        }
        public void seDeplacer(int _newX,int _newY)
        {
            this.X=_newX;
            this.Y= _newY;
        }
        public Point symAbscisse()
        {
            Point symAPoint= new Point(this.X,-this.Y);
            return symAPoint;
        }

        public Point symOrdonnees()
        {
            Point symOPoint = new Point(-this.X,this.Y);
            return symOPoint;
        }
        public Point symOrigine()
        {
            Point symOrPoint =new Point(-this.X,-this.Y);
            return symOrPoint;
        }
        public double disPoint(Point sPoint)
        {
            double base = Math.pow(getX(),2)+Math.pow(sPoint.getX(),2);
            double cote = Math.pow(getY(),2)+Math.pow(sPoint.getY(),2);
            double clacule = Math.sqrt(base+cote);

            return clacule;
        }
    }
}
