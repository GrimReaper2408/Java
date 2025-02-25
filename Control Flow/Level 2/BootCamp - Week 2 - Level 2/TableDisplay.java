import java.util.Scanner;
class TableDisplay
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Enter number: ");
        num = sc.nextDouble();
        for(int i=6;i<=9;i++)
        {
            System.out.println(num+" multiplied by "+i+" is: "+(num*i));
        }
    }
}