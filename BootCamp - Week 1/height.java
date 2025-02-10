//Write a program that takes your height in centimeters and converts it into feet and inches
//Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
import java.util.Scanner;
class height
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double height_cm,height_inch,height_feet;
        System.out.println("Enter your height in centimeters: ");
        height_cm = sc.nextDouble();
        height_inch = height_cm /2.54;
        height_feet = height_inch/12;
        System.out.println("Your height in cm is "+height_cm+" in inches is "+height_inch+" in feet is "+height_feet);
    }
}