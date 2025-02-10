//Write a Program to compute the volume of Earth in km^3 and miles^3
//Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
import java.util.Scanner;
class volume
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double radius,vol_km,vol_miles;
        System.out.println("Enter the radius: ");
        radius = sc.nextDouble();
        vol_km = (4/3)*3.14*radius;
        vol_miles = vol_km / 1.6;
        System.out.println("Volume in km is "+vol_km+" and in miles is "+vol_miles);
    }
}

