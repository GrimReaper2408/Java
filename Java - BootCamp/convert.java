//Create a program to convert the distance of 10.8 kilometers to miles.
//Hint: 1 km = 1.6 miles
import java.util.Scanner;
class convert
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        float km = sc.nextFloat();
        double miles = km / 1.6;
        System.out.println("Distance of "+km+" in miles is "+miles);
    }
}