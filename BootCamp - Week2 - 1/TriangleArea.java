import java.util.Scanner;
class TriangleArea
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double base, height, areaInch, areaCentimeter;
        System.out.println("Enter base and height in inches: ");
        base = sc.nextDouble();
        height = sc.nextDouble();
        areaInch = 0.5 * base * height;
        areaCentimeter = areaInch * 2.5;
        System.out.println("Area of triangle in inches is "+areaInch+" and in cm is "+areaCentimeter);
    }
}