import java.util.Scanner;
class triangleArea
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double base, height, area_in, area_cm;
        System.out.println("Enter base and height in inches: ");
        base = sc.nextDouble();
        height = sc.nextDouble();
        area_in = 0.5 * base * height;
        area_cm = area_in * 2.5;
        System.out.println("Area of triangle in inches is "+area_in+" and in cm is "+area_cm);
    }
}