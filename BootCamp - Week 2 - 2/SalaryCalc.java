import java.util.Scanner;
class SalaryCalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int originalSalary,bonus;
        System.out.println("Enter salary and bonus: ");
        originalSalary = sc.nextInt();
        bonus = sc.nextInt();
        System.out.println("Final salary: "+(originalSalary + bonus));
    }
}