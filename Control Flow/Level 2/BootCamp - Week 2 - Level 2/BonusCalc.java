import java.util.Scanner;
class BonusCalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double salary, bonus, years;
        System.out.println("Enter salary and number of years served: ");
        salary = sc.nextDouble();
        years = sc.nextInt();
        bonus = (years/100)*salary;
        System.out.println("Bonus is: "+bonus);
    }
}