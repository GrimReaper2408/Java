import java.util.Scanner;
class distanceFinder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float dist_feet,dist_mile,dist_yard;
        System.out.println("Enter distance in feet: ");
        dist_feet = sc.nextFloat();
        dist_mile = dist_feet/5280;
        dist_yard = dist_feet/3;
        System.out.println("Distance in miles and yards is "+dist_mile+" and "+dist_yard);
    }
}