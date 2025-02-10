import java.util.Scanner;
class discount2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double fees,disc,disc_amt,disc_price;
        System.out.println("Enter fees and discount percentage: ");
        fees = sc.nextDouble();
        disc = sc.nextDouble();
        disc_amt = (disc / 100) * fees;
        disc_price = fees - disc_amt;
        System.out.println("The discount amt is "+disc_amt+" and discounted fees is "+disc_price);
    }
}