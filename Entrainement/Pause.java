package Entrainement;
import java.time.LocalTime;

public class Pause 
{
    public static void main(String[] args) 
    {
        while (true) 
        {
            LocalTime maintenant = LocalTime.now();
            LocalTime heureFomat =LocalTime.of(maintenant.getHour(),maintenant.getMinute(),maintenant.getSecond());


            System.out.println(heureFomat);
            System.out.print("\033\143");
            if (heureFomat == LocalTime.of(15,15,00)) 
            {
                System.out.println("Pause");
                break;
            }
        }
        
    }
}
