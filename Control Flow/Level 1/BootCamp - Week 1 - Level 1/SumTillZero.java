import java.util.Scanner;
class SumTillZero
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter number: ");
        num = sc.nextInt();
        while(num!=0)
        {
            sum+=num;
            System.out.println("The sum till now is "+sum);
            System.out.println("Enter number: ");
            num = sc.nextInt();
        }
        System.out.println("The sum is "+sum);
    }
}