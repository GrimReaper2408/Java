import java.util.Scanner;
class Convert
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        float kilometer = sc.nextFloat();
        double miles = kilometer / 1.6;
        System.out.println("Distance of "+kilometer+" in miles is "+miles);
    }
}