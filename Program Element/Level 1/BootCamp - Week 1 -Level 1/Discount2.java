import java.util.Scanner;
class Discount2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double fees,discount,discountedAmount,discountedPrice;
        System.out.println("Enter fees and discount percentage: ");
        fees = sc.nextDouble();
        discount = sc.nextDouble();
        discountedAmount = (discount / 100) * fees;
        discountedPrice = fees - discountedAmount;
        System.out.println("The discount amt is "+discountedAmount+" and discounted fees is "+discountedPrice);
    }
}