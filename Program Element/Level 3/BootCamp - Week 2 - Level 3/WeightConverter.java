import java.util.Scanner;
class WeightConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double pound, kilogram;
        System.out.println("Enter weight in pounds: ");
        pound = sc.nextDouble();
        kilogram = pound / 2;
        System.out.println("The weight in kilograms is: "+kilogram);
    }
}