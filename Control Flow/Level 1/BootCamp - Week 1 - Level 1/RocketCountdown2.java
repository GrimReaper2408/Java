import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class RocketCountdown2   
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int delay;
        System.out.println("Enter time to launch: ");
        delay = in.nextInt();
        for(int i=delay;i>=0;i--)
        {
            System.out.println(i+" seconds left.");
            try
            {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException ie)
            {
                System.out.println("TimeError.");
                System.exit(0);
            }
            if(i == 0)
            {
                System.out.println("Take off!");
                System.exit(0);
            }
        }
    }
}
