import java.util.Scanner;
class CalculatePrice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cost, quantity, amount;
        System.out.println("Enter cost and quantity of item: ");
        cost = sc.nextInt();
        quantity = sc.nextInt();
        amount = cost*quantity;
        System.out.println("Total price is "+amount);
    }
}