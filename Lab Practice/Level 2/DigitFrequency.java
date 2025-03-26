import java.util.Scanner;
public class DigitFrequency 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.next();
        int[] frequency = new int[10];
        for (char digit : number.toCharArray())
        {
            if (Character.isDigit(digit)) 
            {
                frequency[Character.getNumericValue(digit)]++;
            }
        }
        System.out.println("\nFrequency of each digit:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Digit " + i + ": " + frequency[i]);
        }
        scanner.close();
    }
}