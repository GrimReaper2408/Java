import java.util.Scanner;
class TempChanger
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float tempCelcius, tempFarenheit;
        System.out.println("Enter temperature in celcius: ");
        tempCelcius = sc.nextFloat();
        tempFarenheit = ((9/5)*tempCelcius) + 32;
        System.out.println("Temperature in farenheit: "+tempFarenheit);
    }
}