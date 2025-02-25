import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class RocketCountdown
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int delay;
        System.out.println("Enter time to launch: ");
        delay = in.nextInt();
        while(delay>=0)
        {
            System.out.println(delay+" seconds left.");
            delay--;
            try
            {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException ie)
            {
                System.out.println("TimeError.");
                System.exit(0);
            }
            if(delay == 0)
            {
                System.out.println("Take off!");
                System.exit(0);
            }
        }
    }
}
