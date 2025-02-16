import java.util.Scanner;
class calculatePrice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cost, qty, amt;
        System.out.println("Enter cost and quantity of item: ");
        cost = sc.nextInt();
        qty = sc.nextInt();
        amt = cost*qty;
        System.out.println("Total price is "+amt);
    }
}