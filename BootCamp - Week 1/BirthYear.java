import java.util.Scanner;
class BirthYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current year: ");
        int currentYear = sc.nextInt();
        int birthYear = 2000;
        int age = currentYear - birthYear;
        System.out.println("Age is: "+age);
    }
}