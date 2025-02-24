import java.util.Scanner;
class Calc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float sellingPrice,costPrice,profit,loss,profitPercentage,lossPercentage; 
        System.out.println("Enter cost price and selling price: ");
        costPrice = sc.nextFloat();
        sellingPrice = sc.nextFloat();
        profit = sellingPrice-costPrice;
        loss = costPrice-sellingPrice;
        profitPercentage = (profit/costPrice)*100;
        System.out.println("The profit is "+profit+" and profit percentage is "+profitPercentage);
    }
}