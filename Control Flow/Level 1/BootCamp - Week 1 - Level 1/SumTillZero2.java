import java.util.Scanner;
class SumTillZero2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num,sum=0;
        while(1>0)
        {
            System.out.println("Enter number: ");
            num = sc.nextInt();
            if(num==0)
            {
                break;
            }
            sum+=num;
            System.out.println("The sum till now is "+sum);
        }
        System.out.println("The sum is "+sum);
    }
}