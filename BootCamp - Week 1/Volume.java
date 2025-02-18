import java.util.Scanner;
class Volume
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double radius,volumeKilometer,volumeMiles;
        System.out.println("Enter the radius: ");
        radius = sc.nextDouble();
        volumeKilometer = (4/3)*3.14*radius;
        volumeMiles = volumeKilometer / 1.6;
        System.out.println("Volume in km is "+volumeKilometer+" and in miles is "+volumeMiles);
    }
}

