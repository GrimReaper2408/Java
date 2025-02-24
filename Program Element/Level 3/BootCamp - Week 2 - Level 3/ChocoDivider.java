import java.util.Scanner;
class ChocoDivider
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double children, chocolates, division;
        System.out.println("Enter number of children and chocolates: ");
        children = sc.nextDouble();
        chocolates = sc.nextDouble();
        division = chocolates/children;
        System.out.println("The division is: "+division);
    }
}