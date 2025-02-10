import java.util.Scanner;
class discount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double fees,disc,disc_price;
        System.out.println("Enter fees: ");
        fees = sc.nextFloat();
        disc = 0.1 * fees;
        disc_price = fees - disc;
        System.out.println("The discount amt is "+disc+" and discounted fees is "+disc_price);
    }
}