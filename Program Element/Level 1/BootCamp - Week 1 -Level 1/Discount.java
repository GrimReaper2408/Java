import java.util.Scanner;
class Discount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double fees,discount,discountedPrice;
        System.out.println("Enter fees: ");
        fees = sc.nextFloat();
        discount = 0.1 * fees;
        discountedPrice = fees - discount;
        System.out.println("The discount amt is "+discount+" and discounted fees is "+discountedPrice);
    }
}