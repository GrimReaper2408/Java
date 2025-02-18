import java.util.Scanner;
class DistanceFinder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float distFeet,distMile,distYard;
        System.out.println("Enter distance in feet: ");
        distFeet = sc.nextFloat();
        distMile = distFeet/5280;
        distYard = distFeet/3;
        System.out.println("Distance in miles and yards is "+distMile+" and "+distYard);
    }
}