import java.util.Scanner;
class Distance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double kilometer,miles;
        System.out.println("Enter distance in kilometers: ");
        kilometer = sc.nextDouble();
        miles = kilometer/1.6;
        System.out.println("Distance in miles is "+miles);
    }
}