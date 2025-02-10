//Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
import java.util.Scanner;
class birth_year
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current year: ");
        int current_year = sc.nextInt();
        int birth_yr = 2000;
        int age = current_year - birth_yr;
        System.out.println("Age is: "+age);
    }
}