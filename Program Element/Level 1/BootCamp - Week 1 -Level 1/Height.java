import java.util.Scanner;
class Height
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double heightCentimeter,heightInch,heightFeet;
        System.out.println("Enter your height in centimeters: ");
        heightCentimeter = sc.nextDouble();
        heightInch = heightCentimeter /2.54;
        heightFeet = heightInch/12;
        System.out.println("Your height in cm is "+heightCentimeter+" in inches is "+heightInch+" in feet is "+heightFeet);
    }
}