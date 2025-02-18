import java.util.Scanner;
class TempChanger2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double temperatureCelcius, temperatureFarenheit;
        System.out.println("Enter temperature in farenheit: ");
        temperatureFarenheit = sc.nextDouble();
        temperatureCelcius = ((temperatureFarenheit - 32.0) * (5.0/9.0));
        System.out.println("Temperature in celcius: "+temperatureCelcius);
    }
}