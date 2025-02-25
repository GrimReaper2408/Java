import java.util.Scanner;
class GreatestFactor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num,cnt=0;
        System.out.println("Enter num: ");
        num = sc.nextInt();
        int[] factors = new int[num];
        System.out.print("Greatest Factor: ");
        for(int i=num-1;i>0;i--)
        {
            if(num%i==0)
            {
                System.out.print(i);
                System.exit(0);
            }
        }
    }
}