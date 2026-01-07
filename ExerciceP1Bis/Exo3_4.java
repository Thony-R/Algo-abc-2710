package ExerciceP1Bis;
import java.util.Random;
public class Exo3_4
{
    public static void main(String[] args)
    {
        Random rdm = new Random();

        int[]nbNTrier = new int[15];
        int temp;

        for(int i = 0;i<nbNTrier.length;i++)
        {
            nbNTrier[i]= rdm.nextInt(315);
        }
        for(int i=0; i<nbNTrier.length;i++)
        {
            System.out.print(nbNTrier[i]+", ");
        }

        System.out.println();

        for(int i=0;i<nbNTrier.length;i++)
        {
            for(int j=0;j<nbNTrier.length;j++)
            {
                if(nbNTrier[i]<nbNTrier[j])
                {
                    temp = nbNTrier[j];
                    nbNTrier[j]=nbNTrier[i];
                    nbNTrier[i]=temp;
                }
            }
        }
        for(int i=0;i<nbNTrier.length;i++)
        {
            System.out.print(nbNTrier[i]+", ");
        }
    }
}